import java.util.Scanner;
public class Exerc�cio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro n�mero inteiro");
		int primeiro = entrada.nextInt();
		System.out.println("Insira o segundo n�mero inteiro");
		final int segundo = entrada.nextInt();
		
		
		for(int i = primeiro; i <= segundo; i++) { 
			System.out.println(i);
		}
		
		entrada.close();
	}

}
