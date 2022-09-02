import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro:");
		int num = entrada.nextInt();
		
		if((num % 2 == 0) && (num !=2)) {
			System.out.println(num + " não é um número primo");
		}else {
			System.out.println(num + " é um número primo");
		}
		entrada.close();
		
	}

}
