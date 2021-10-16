import java.util.Scanner;
public class Exercício10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor da base.");
		int base = entrada.nextInt();
		System.out.println("Insira o valor do expoente.");
		int expoente = entrada.nextInt();
		
		int resultado= 1;
		
		for (int i = 0 ; i < expoente ; i++) {
			resultado *= base;
		}
		System.out.println("o Resultado de "+ base+" elevado à "+expoente+" é "+resultado);
		entrada.close();
	}

}
