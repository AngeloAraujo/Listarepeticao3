import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadetemperatura;
		int cont=0;
		float temperatura=0;
		float maiortemperatura= 0;
		float menortemperatura = 0;
		float somatemperatura = 0;
		float mediatemperatura = 0;

		System.out.println("Quantas temperaturas serão informadas?: ");
		quantidadetemperatura = entrada.nextInt();

		for (int i = 0; i < quantidadetemperatura; i++) {
			System.out.println("Digite a temperatura:");
			temperatura = entrada.nextFloat();
			cont ++;
			

			if (i == 0) {
				maiortemperatura = temperatura;
				menortemperatura = temperatura;
				somatemperatura = somatemperatura + temperatura;
			} else {
				if (temperatura > maiortemperatura) {
					maiortemperatura = temperatura;
					somatemperatura = somatemperatura + temperatura;
				} else {
					menortemperatura = temperatura;
					somatemperatura += temperatura;
				}
			}
		}
		mediatemperatura = somatemperatura / cont;

		System.out.println("A maior temperatutura foi " + maiortemperatura);
		System.out.println("A menor temperatutura foi " + menortemperatura);
		System.out.println("A média da temperatura é " + mediatemperatura);
		
		entrada.close();
	}

}
