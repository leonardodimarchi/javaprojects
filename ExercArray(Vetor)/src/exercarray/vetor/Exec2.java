package exercarray.vetor;

import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {
         int[] A = new int[8];
        int B[] = new int[8];
        int cc,num;
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Digita um numero ai: ");
        
        num = teclado.nextInt();
        
        for(cc = 0; cc<= 7; cc++){
            A[cc] = num;
            B[cc] = A[cc]*2;
        }
        
        
        for (cc = 0; cc < B.length; cc++){
            System.out.println("Valor de A: "+A[cc]+" Valor de B: "+B[cc]);
        }
    }
}
