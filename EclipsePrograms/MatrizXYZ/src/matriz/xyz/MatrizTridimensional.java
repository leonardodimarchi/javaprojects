package matriz.xyz;

public class MatrizTridimensional {
	
	public static void main(String[] args) {
		
		int matriz[][][] = new int[3][3][3];
		
		for (int cc = 0; cc < matriz.length; cc++) {
			for (int j = 0; j < matriz.length; j++) {
				for (int z = 0; z < matriz.length; z++) {
					System.out.println("X: "+cc+" Y: "+j+" Z: "+z+" SOMA: "+(cc+j+z));
					matriz[cc][j][z] = cc+j+z;
				}
			}
		}
		
		int somaTot=0;
		int somaPar=0;
		int somaImp=0;
		
		for(int cc = 0; cc < matriz.length; cc++) {
			for(int j = 0; j< matriz.length; j++) {
				for(int z = 0; z < matriz.length; z++) {
					somaTot += matriz[cc][j][z];
					
					if(matriz[cc][j][z] % 2 == 0) somaPar += matriz[cc][j][z];
					else somaImp += matriz[cc][j][z];
				}
			}
		}
		
		System.out.println("\nSoma total: "+somaTot+"\nSoma dos pares: "+somaPar+"\nSoma dos impares: "+somaImp);
		
	}
}
