package exercarray.vetor;

import java.util.Scanner;

public class Exec9 {
     public static void main(String[] args) {
        int[] A = new int[10];
        float B[] = new float[10];
        int[] C = new int[10];    
        int cc,num;
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Digita um numero ai: ");
        
        num = teclado.nextInt();
        
        for(cc = 0; cc< 10; cc++){
            A[cc] = num+ cc;
            B[cc] = (float)A[cc];
            C[cc] = A[cc]/(int)B[cc];
        }
        
        
        for (cc = 0; cc < B.length; cc++){
            System.out.printf("Valor de A: %d Valor de B: %.2f Valor de C: %d\n",A[cc],B[cc],C[cc]);
        }
    }
}
