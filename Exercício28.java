import java.util.Scanner;

public class Exerc�cio28 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadetemperatura, i = 0;
		float temperatura, maiortemperatura= 0, menortemperatura = 0;
		float somatemperatura = 0, mediatemperatura = 0;

		System.out.println("Quantas temperaturas ser�o informadas?: ");
		quantidadetemperatura = entrada.nextInt();

		for (i = 0; i < quantidadetemperatura; i++) {
			System.out.println("Digite a temperatura:");
			temperatura = entrada.nextFloat();

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
					somatemperatura = somatemperatura + temperatura;
				}
			}
		}
		mediatemperatura = somatemperatura / i;

		System.out.println("A maior temperatutura foi " + maiortemperatura);
		System.out.println("A menor temperatutura foi " + menortemperatura);
		System.out.println("A m�dia da temperatura � " + mediatemperatura);
		
		entrada.close();
	}

}
