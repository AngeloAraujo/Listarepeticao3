import java.util.Scanner;
public class Exercício37 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in) ;
			
			float mediaf;
			String[] resposta = new String [10];
						
				for(int k = 0; k < 10; k++) {
					System.out.println("Resposta da questão " + (k+1) + " :");
					resposta[k] = entrada.nextLine();
				}
				
				
				System.out.println("Digite suas respostas");
				
				int contapontos = 1, maioracerto = 0, menoracerto = 0;
				float somaf = 0;
				
				boolean x = true;
				while(x) {
					
				int acertos = 0;
				
				for(int i = 0; i < 10; i++) {
			
					System.out.println("Resposta da questão " + (i+1) + ":");
					String r = entrada.nextLine();
					
					if(resposta[i].equals(r)) {
						acertos++;
					}else {
						System.out.println("A resposta correta é "+resposta[i]);
					}
					
				}
					System.out.println("Total de acertos: " + acertos);
					System.out.println("Nota = " + acertos);
					
					if(contapontos == 1) {
						maioracerto = acertos;
						menoracerto = acertos;
						somaf = somaf + acertos;
					}else {
						if(acertos < menoracerto) {
							menoracerto = acertos;
							somaf = somaf + acertos;
						}else if(acertos > maioracerto) {
							maioracerto = acertos;
							somaf = somaf + acertos;
						}
					}
					
					System.out.println("Outro aluno vai utilizar o sistema?(Digite 1 - sim; 2 - não)");
					int aluno = entrada.nextInt();
					
					entrada.nextLine();				
					
					if(aluno == 1) {
						x = true;
						contapontos++;
					}else if(aluno == 2) {
						x = false;
					}
							
				}

			mediaf = (somaf/contapontos);
			
			System.out.println("Menor acerto: " + menoracerto);
			System.out.println("Maior acerto: " + maioracerto);
			System.out.println("Total de alunos que utilizaram o sistema: " + contapontos);
			System.out.println("Média: " + mediaf);
			
			entrada.close();
			
	}
		}
