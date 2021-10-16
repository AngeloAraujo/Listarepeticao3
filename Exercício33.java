import java.util.Scanner;
public class Exercício33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int maisalto = 0;
		int maisbaixo = 0;
		int nalto = 0, nbaixo = 0;
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println("Digite o número do aluno:");
			int n = input.nextInt();
			System.out.println("Digite a altura do aluno:");
			int altura = input.nextInt();
			
			if( i == 0) {
				maisalto = altura;
				nalto = n;
				maisbaixo = altura;
				nbaixo = n;
			}	
			else {
				if(altura < maisbaixo) {
					maisbaixo = altura;
					nbaixo = n;
				}else if(altura > maisalto) {
					maisalto = altura;
					nalto = n;
				}
			}
		}
		
		System.out.println("Número do mais alto: " + nalto + " com " + maisalto + " cm.");
		System.out.println("Número do mais baixo: " + nbaixo + " com " + maisbaixo + " cm.");
		
		input.close();	
	}

}
