package exercarray.vetor;

import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int cc,par=0;
        
        Scanner tecla  = new Scanner(System.in);
        
        for(cc = 0; cc < A.length;cc++){
            System.out.printf("Digite o %dº valor: ",cc+1);
            A[cc] = tecla.nextInt();
            if (A[cc] % 2 == 0) par++;
        }
        
        System.out.println("A quantidade de pares é: "+par);
    }
}
