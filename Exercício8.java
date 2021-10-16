import java.util.Scanner;
public class Exercício8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número inteiro");
		int primeiro = entrada.nextInt();
		System.out.println("Insira o segundo número inteiro");
		final int segundo = entrada.nextInt();
		
		int soma =0;
		
		for(int i = primeiro; i <= segundo; i++) { 
			soma = soma + i;
			System.out.print(soma + " ");
		}
		
		entrada.close();
	}

}
