import java.util.Scanner;
public class Exerc�cio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o n�mero da tabuada que voc� quer ver?");
		int tab = entrada.nextInt();
		
		final int Tam = 10;
		
		for(int i = 1; i <= Tam; i++) { 
			int mult = tab * i;
		System.out.println(tab + " x " + i + " = " + mult) ;
		}
		entrada.close();
		
		}
	}