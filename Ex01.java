import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float nota;

		do {
			System.out.println("Informe uma nota de 0 � 10: ");
			nota = entrada.nextFloat();
			
		} while (nota > 10 || nota < 0);
		entrada.close();
	}
}