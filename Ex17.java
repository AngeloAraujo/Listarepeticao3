import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro:");
		int num = entrada.nextInt();
		
		if((num % 2 == 0) && (num !=2)) {
			System.out.println(num + " n�o � um n�mero primo");
		}else {
			System.out.println(num + " � um n�mero primo");
		}
		entrada.close();
		
	}

}
