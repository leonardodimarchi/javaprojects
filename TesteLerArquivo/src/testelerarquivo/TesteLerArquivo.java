package testelerarquivo;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
//Bibliotecas que jogam uma exceção(throws).
import java.io.FileNotFoundException;
import java.io.IOException;


public class TesteLerArquivo {

    public static void main(String[] args){
        //Criou um leitor de arquivo.
        BufferedReader leitor = null; 
        //Teclado e variavel para contar.
        Scanner teclado = new Scanner(System.in);
        int total = 0;
        //Pergunta.
        System.out.print("Digite o nome do arquivo TXT: ");
        String nome = teclado.next();
        
        try{
            //Abre o arquivo para o leitor.
            leitor =  new BufferedReader(new FileReader("C:\\Users\\leogu\\Desktop\\"+nome+".txt"));
            //Variavel que vai ser usada para ler cada linha.
            String linha;
            //Verifica cada linha e soma na variavel "total".
            while ((linha = leitor.readLine())!= null){
               total += Integer.valueOf(linha);
            }
            //Printa no total.
            System.out.println("Total: "+total);
        //Erro caso tenha algo alem de numero na linha.
        }catch(NumberFormatException e){
            System.out.println("ERRO! Valor inválido: "+e.getMessage());
        //Erro caso o arquivo não esteja disponivel.
        }catch(FileNotFoundException ex){
            System.out.println("ERRO! Arquivo não encontrado: "+ex.getMessage());
        //Erro caso ocorra qualquer outro erro com o arquivo.
        }catch(IOException exc){
            System.out.println("ERRO! Falha com o arquivo: "+exc.getMessage());
        //Finalização, fechando o leitor.
        }finally{
            try{
                if(leitor != null){
                    leitor.close();
                }
            //Qualquer Erro ao fechar o leitor.
            }catch(Exception erro){
                System.out.println("ERRO2: "+erro.getMessage()+"\n");
                erro.printStackTrace(System.out);
            }
        }
    }
    
}

//Para especificar cada ERRO, vários catchs podem ser usados, mas pode ser um catch geral:
        //}catch(Exception e){
          //  System.out.println("ERRO1: "+e.getMessage()+"\n");
          //  e.printStackTrace(System.out);