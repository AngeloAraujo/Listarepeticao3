import java.util.Scanner;
public class Exerc�cio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0, impar = 0, par = 0;
		

		for (int x = 0; x < 10; x++) {
			System.out.println("Insira um n�mero inteiro:");
			num = entrada.nextInt();
			if (num % 2 != 0) {
				impar = impar +1;
			} else
				par = par +1;
		}
		System.out.println("Quantidade de n�meros impares:" + impar);
		System.out.println("Quantidade de n�meros pares:" + par);
		
		entrada.close();
	}
}
