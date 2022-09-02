import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1 = 1;
		int numero2 = 1;
		
		System.out.print("Insira a quantidade de termos você quer visualizar: ");
		int termo= entrada.nextInt();
		
		System.out.print("S = ");
		while(numero1 <= termo) {
			System.out.print(numero1 + "/" + numero2 + " + ");
			numero1++;
			numero2 +=2;
		}
		System.out.print(" ...");
	
		entrada.close();
	}

}
