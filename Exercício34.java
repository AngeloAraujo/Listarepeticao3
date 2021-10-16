import java.util.Scanner;
public class Exercício34 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0,quantidade1 = 0,quantidade2 = 0,quantidade3 = 0,quantidade4 = 0;
		
		while (true) {
			System.out.println("Digite um numero para iniciar a contagem. (Para encerrar o código digite um número negativo).");
			num=entrada.nextInt();
		
			if(num>0) {
				
				if ((num >= 0) && (num <= 25)) { 
					quantidade1++;
						
				}else if ((num >= 26) && (num <= 50)) {
					quantidade2++;
				
				}else if ((num >= 51) && (num <= 75)) {
					quantidade3++;
				
				}else if ((num >= 76) && (num <= 100)) {
					quantidade4++;
				}
					
			}
				
			else {
				System.out.println("Fim do programa");
				break;
			}
		}
		
		System.out.println("A quantidade de números entre 0 e 25 : "+ quantidade1);
		System.out.println("A quantidade de números entre 26 e 50 : "+ quantidade2);
		System.out.println("A quantidade de números entre 51 e 75 : "+ quantidade3);
		System.out.println("A quantidade de números entre 76 e 100 : "+ quantidade4);
		entrada.close();
	}
}

