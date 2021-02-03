package exercarray.vetor;

import java.util.Scanner;

public class ExercArrayVetor {

    //Temperaturas de um mês
    
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int cc;
        int[] temp = new int[31];
        
        //Teste
        for(cc = 0; cc<=9;cc++){
            System.out.format("Digite a temperatura do %d mês: ",cc+1);
            temp[cc] = tecla.nextInt();
        }
        
        for(cc = 0; cc <= temp.length-1; cc++){
            System.out.println("Temperatura do dia "+(cc+1)+": " +temp[cc]+"º Celsius.");
        }
    }
    
}
