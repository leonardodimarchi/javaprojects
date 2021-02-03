package matriz.exerc;

import java.util.Random;

public class exec1 {

	public static void main(String[] args) {
		
		Random num = new Random();
		
		int maior=0, linha=0, coluna=0;
		int[][] numeros  = new int[4][4];
		
		for (int cc = 0; cc < numeros.length; cc++) {
			for(int i = 0; i < numeros[cc].length; i++) {
				numeros[cc][i] = num.nextInt(90)+10;  		//10 ~ 100.
				System.out.print(numeros[cc][i]+" ");
			}
			System.out.println();
		}
		
		for (int cc = 0; cc < numeros.length; cc++) {
			for (int i = 0; i < numeros[cc].length; i++) {
				if (numeros[cc][i] > maior) {
					maior = numeros[cc][i];
					linha = cc;
					coluna = i;
				}
			}
		}
		
		System.out.println("\nO Maior numero é: "+maior+"\nLinha: "+linha+"\nColuna: "+coluna);
	}
}
