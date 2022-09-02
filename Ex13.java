import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int fatorial = 1;
		System.out.println("Digite um número: ");
		int n = entrada.nextInt();
		
		for(int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
			
		}
		System.out.println("O fatorial de " + n + " é " + fatorial);
		
		entrada.close();
	}

}
