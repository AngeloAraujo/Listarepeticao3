import java.util.Scanner;
public class Exercício19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int divisao = 0;
		
		System.out.println("Digite um número inteiro:");
		num = entrada.nextInt();
	
		for(int i =1; i <= num;i++) {
			if((i % 2 == 1) && (i != 2) || (i == 2)){
				System.out.print(i + "  \n");
				divisao++;
			}else {
				divisao++;
			}
		}
		System.out.println("O número de divisões desse número inteiro para encontrar o número primo foi " + divisao);	
		
		entrada.close();
	}
}
