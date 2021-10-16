import java.util.Scanner;
public class Exercício16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantos serão os números inteiros do conjunto:");
		int numeros = entrada.nextInt();
	
		int menor = 0, maior = 0;
		
			for(int contador = 1; contador <= numeros; contador++) {
				System.out.println("Digite um número do conjunto:");
				int num = entrada.nextInt();
				
				if(contador == 1){
						menor = num;
						maior = num;	
				}
				else {
				}if(num <= menor) {
						menor = num;
					}else if(num >= maior) {
						maior = num;
				}
			}
		int soma = menor + maior; 
		
		System.out.println("O menor número é " + menor);
		System.out.println("O maior número é " + maior);
		System.out.println("A soma de " + menor + " e " + maior + " é " + soma);		
		
		entrada.close();
	
	}
}
