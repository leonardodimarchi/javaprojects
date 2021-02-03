package exercarray.vetor;

import java.util.Scanner;
// cont*100/n
public class Exec15 {
    public static void main(String[] args) {
        final int NUM = 10;
        Scanner s = new Scanner(System.in);
        int cc,contP=0,contImp=0;
        int perP,perImp;
        int[] A = new int[10];
                
        for(cc=0;cc < A.length;cc++){
            System.out.printf("Digite o %dº numero: ",cc+1);            
            A[cc] = s.nextInt();
            if (A[cc]%2 == 0) contP++; else contImp++;            
        }
        perP = (contP*100)/NUM;
        perImp = (contImp*100)/NUM;
        
        System.out.printf("Pares: %d%%\n",perP);
        System.out.printf("Impares: %d%%\n",perImp);
    }
}
