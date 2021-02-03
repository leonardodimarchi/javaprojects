import java.util.Scanner;
import java.lang.ArithmeticException;

public class Divis{
	public static float div(float num1, float num2) throws ArithmeticException{
		float resposta=0;
		if(num2 <= 0) {
			throw new ArithmeticException("ERRO: / por 0");
		}else{
			resposta = num1/num2;
		}
		return resposta;
	}

	public static void main(String[] args){
		float num1,num2,resp=0;
		Scanner  tecla = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		num1 = tecla.nextFloat();
		
		System.out.print("Digite o segundo numero: ");
		num2 = tecla.nextFloat();

		try{
			resp = div(num1,num2);
			System.out.printf("\nResposta: %.1f",resp);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}