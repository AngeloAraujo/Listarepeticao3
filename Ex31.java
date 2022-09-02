import java.util.Scanner;
public class Ex31 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int alunoalto = 0;
		int alunobaixo = 0;
		int codigoalto = 0, codigobaixo = 0;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite o número do aluno:");
			int codigo = entrada.nextInt();
			System.out.println("Digite a altura do aluno:");
			int altura = entrada.nextInt();
			
			if( i == 0) {
				alunoalto = altura;
				codigoalto = codigo;
				alunobaixo = altura;
				codigobaixo = codigo;
			}	
			else {
				if(altura < alunobaixo) {
					alunobaixo = altura;
					codigobaixo = codigo;
				}else if(altura > alunoalto) {
					alunoalto = altura;
					codigoalto = codigo;
				}
			}
		}
		
		System.out.println("O código do aluno mais alto é: " + codigoalto + " com " + alunoalto + " cm.");
		System.out.println("O código do aluno mais alto é: " + codigobaixo + " com " + alunobaixo + " cm.");
		
		entrada.close();	
	}

}
