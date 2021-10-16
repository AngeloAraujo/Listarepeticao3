import java.util.Scanner;
public class Exercício23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float somaf = 0, mediaF = 0;
		int alunos;
		
		System.out.println("Digite a quantidade de turmas?");
		int quantidadeturmas = entrada.nextInt();
		
		for(int i = 1; i <= quantidadeturmas; i++) {
		System.out.println("Digite a quantidade de alunos:");
		alunos = entrada.nextInt();
			while(alunos > 40) {
				System.out.println("A turma não pode ter mais de 40 alunos!");
				System.out.println("Digite a quantidade de alunos:");
				alunos = entrada.nextInt();
			}
			somaf = somaf + alunos;	
		}
		
		mediaF = somaf/quantidadeturmas;
		
		System.out.println("Média de alunos por turma: " + mediaF);
		
		entrada.close();
	}

}
