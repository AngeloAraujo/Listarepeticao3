import java.util.Scanner;
public class Exerc�cio22 {

	public static void main(String[] args) {
				
	Scanner entrada = new Scanner(System.in);

	int candidato1 = 0;
	int candidato2 = 0;
	int candidato3 = 0;

	System.out.println("Insira o n�mero total de votantes:");
	int votantes = entrada.nextInt();

	for (int i = 1; i <= votantes; i++) {
	System.out.println("Insira o n�mero do candidato:  1 para o 1� Candidato, 2 para o 2�Candidato,  3 para o Candidato ");
	int candidato = entrada.nextInt();

	if (candidato == 1)
		candidato1++;

	else if (candidato == 2)
			candidato2++;

	else if (candidato == 3)
			candidato3++;

	else
		System.out.println("Insira um n�mero de candidato v�lido!");
						
		}
	System.out.println("O n�mero de votos para cada candidato ser�:");
	System.out.println("Candidato 1 = " + candidato1);
	System.out.println("Candidato 2 = " + candidato2);
	System.out.println("Candidato 3 = " + candidato3);

	entrada.close();
	}
}