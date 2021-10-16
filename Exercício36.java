import java.util.Scanner;
public class Exercício36 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		int candidato4 = 0;
		int nulos = 0;
		int branco = 0;
		float cont = 0;
		
			System.out.println("Digite 0 - Para finalizar o conjunto de votos");
			System.out.println("1 - Farias;");
			System.out.println("2 - Maria;");
			System.out.println("3 - Alberto;");
			System.out.println("4 - Ana;");
			System.out.println("5 - Voto nulo;");
			System.out.println("6 - Voto em branco;");
			
		while(true) {
			System.out.println("Digite seu voto:");
			int voto = entrada.nextInt();
			
			
			if( voto == 0) 
				break;
			if(voto == 1) {
				candidato1++;
				cont++;
			}if(voto == 2) {
				candidato2++;
				cont++;
			}if(voto == 3) {
				candidato3++;
				cont++;
			}if( voto == 4) {
				candidato4++;
				cont++;
			}if(voto == 5) {
				nulos++;
				cont++;
			}if(voto ==6) {
				branco++;
				cont++;
			}
		}
					
			System.out.println("Quantidade de votos de cada candidato: ");
			System.out.println("Farias = " + candidato1);
			System.out.println("Maria = " + candidato2);
			System.out.println("Alberto = " + candidato3);
			System.out.println("Ana = " + candidato4);
			System.out.println("Total de votos nulos: " + nulos);
			System.out.println("Total de votos em branco: " + branco);
			float percentualnulo = ((nulos*100)/  cont);
			float percentualbranco = ((branco*100)/cont);
			System.out.println("Percentual de votos nulos: " + percentualnulo+"%");
			System.out.println("Percentual de votos em branco: " + percentualbranco+"%");
			System.out.println("Total de votos "+cont);
			entrada.close();
	}

}
