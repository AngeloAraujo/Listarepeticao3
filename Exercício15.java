import java.util.Scanner;
public class Exercício15 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int num1 = 38;
		int num2 = 39; 
		int divisor = 0;
		float exponencialf = 0,soma = 0;
		
		
		for(divisor = 1; divisor <= 37; divisor++) {
		num1 = num1-1;
		num2 = num2-1;
		exponencialf = ((num1 * num2)/divisor);
		soma = soma + exponencialf; 
		
		System.out.print("(" +num1 + "*" + num2 + ")/" + divisor + " + "); 
		}
		
		System.out.println("Soma = " + soma);
		entrada.close();

	}
}
