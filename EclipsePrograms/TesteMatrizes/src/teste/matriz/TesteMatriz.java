package teste.matriz;

public class TesteMatriz {
	public static void main(String[] args) {
		double notas[][]= new double[3][4];
		
		notas[0][0] = 7.5;
		notas[0][1] = 9.5;
		notas[0][2] = 9.8;
		notas[0][3] = 6;
		
		notas[1][0] = 9.5;
		notas[1][1] = 8;
		notas[1][2] = 6;
		notas[1][3] = 9.2;
		
		notas[2][0] = 4;
		notas[2][1] = 5;
		notas[2][2] = 7;
		notas[2][3] = 8;
		
		for(int l = 0; l <= 2;l++) {
			
			for(int c=0;c<=3;c++) {
				
				System.out.print(l+1+" - ");
				System.out.print(notas[l][c]+" |");
			}
			
			System.out.println();
		}
	}
}
