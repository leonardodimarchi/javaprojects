package exercarray.vetor;

public class Exec5 {
    
    public static void main(String[] args) {
        final int NUMERO =6;
        int[] A = new int[10];
        int[] B = new int[A.length];      
        int cc;
        
        for(cc = 0; cc < A.length;cc++){
            A[cc] = NUMERO;
            if (cc == 0) B[cc] = A[cc]; else B[cc] = A[cc]*cc;
        }
        
        for(cc = 0; cc<A.length;cc++){
            System.out.println("Valor de A: "+A[cc]+" Valor de B: "+B[cc]);
        }
    }
}
