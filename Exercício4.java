import java.util.Scanner;
public class Exerc�cio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double paisA = 80000;
		double paisB = 200000;
		int anos = 0;
		double crescimentoA = 0.03;
		double crescimentoB = 0.015;
		while (paisA < paisB) {
			anos = (anos + 1);
			paisA = paisA + (paisA * crescimentoA);
			paisB = paisB + (paisB * crescimentoB);
		}
		System.out.println("Ap�s  " + anos +  " anos, o pa�s A ultrapassou o pa�s B em n�mero de habitantes");

		
		
	System.out.println("Insira a popula��o do pa�s A:");
	double paisA1 = entrada.nextDouble();
	System.out.println("Insira a popula��o do pa�s B:");
	double paisB1 = entrada.nextDouble();
	System.out.println("Insira a taxa de crescimento do pa�s A:");
	double crescimentoA1 = entrada.nextDouble();
	System.out.println("Insira a taxa de crescimento do pa�s B:");
	double crescimenotoB1 = entrada.nextDouble();
	
	int anos1 = 0;
	crescimentoA1 = crescimentoA1/100;
	crescimenotoB1 = crescimenotoB1/100;
	
	while (paisA1 <= paisB1) {
		paisA1 = paisA1 + (paisA1 * crescimentoA1);
		paisB1 = paisB1 + (paisB1 * crescimenotoB1);
		anos1++;
	}
	System.out.println("Ap�s" + " " + anos1 + " " + "anos, pa�s A ultrapassou o pa�s B em n�mero de habitantes");

	entrada.close();
}

}

