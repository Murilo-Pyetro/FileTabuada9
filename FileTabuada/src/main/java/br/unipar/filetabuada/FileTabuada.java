/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.filetabuada;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author muril
 */
public class FileTabuada {

    public static void main(String[] args) throws IOException {
        
        File diretorio = new File( "dertorioTabuada");
        
        File arquivo = new File( "dertorioTabuada/Tabuada9.txt");

        try{
            diretorio.mkdir();
            arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso! ");
        }catch(IOException ex){
            System.out.println("Erro ao criar o arquivo: " + ex.getMessage());
    
        }

            try(FileWriter escritor = new FileWriter("dertorioTabuada/Tabuada9.txt");
            BufferedWriter buffer = new BufferedWriter(escritor)){
                
        int numero = 9;

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            
            buffer.write(numero + " x " + i + " = " + resultado + "\n");
        }
    
            
            
        }catch (IOException ex){
            ex.printStackTrace();
        }
        
        try(FileReader leitor = new FileReader("dertorioTabuada/Tabuada9.txt");
                    BufferedReader buffer = new BufferedReader(leitor)){
                String linha;
                while ((linha = buffer.readLine()) != null){
                    System.out.println(linha);
                }
                
            }catch (IOException ex){
                ex.printStackTrace();
            }
        
        arquivo.delete();
        System.out.println("O Arquivo foi deletado");

    }
}
