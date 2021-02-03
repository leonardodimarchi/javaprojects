package exercarray.vetor;

import java.util.Scanner;

public class Exec12 {
    public static void main(String[] args) {
       Scanner tecla = new Scanner(System.in);
       int cc,soma=0;
       int[] A = new int[10];
       
       for(cc = 0; cc < A.length;cc++){
           System.out.printf("Digite um valor para o %dº numero: ",cc+1);
           A[cc] = tecla.nextInt();
           soma += A[cc];
       }
       
        System.out.println("A soma de todos é igual a: "+soma);
       
    }
}
