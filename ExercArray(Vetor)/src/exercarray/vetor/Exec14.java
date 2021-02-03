package exercarray.vetor;

import java.util.Scanner;

public class Exec14 {
    public static void main(String[] args) {
        int cc,soma=0,contImp=0;
        int[] A = new int[10];
        
        Scanner s = new Scanner(System.in);
        
        for(cc=0;cc<A.length;cc++){
            System.out.printf("Digite o %dº numero: ",cc+1);
            A[cc] = s.nextInt();
            if(A[cc]%2 != 0){
                soma+=A[cc];
                contImp++;
            }
        }
        System.out.println("Media dos impares: "+(soma/contImp));
    }
}
