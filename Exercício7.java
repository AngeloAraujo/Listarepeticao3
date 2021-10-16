import java.util.Scanner;
public class Exercício7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número inteiro");
		int primeiro = entrada.nextInt();
		System.out.println("Insira o segundo número inteiro");
		final int segundo = entrada.nextInt();
		
		
		for(int i = primeiro; i <= segundo; i++) { 
			System.out.println(i);
		}
		
		entrada.close();
	}

}
