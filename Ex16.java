import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite quantos ser�o os n�meros inteiros do conjunto:");
		int numeros = entrada.nextInt();
	
		int menor = 0, maior = 0, soma=0;
		
			for(int contador = 1; contador <= numeros; contador++) {
				System.out.print("Digite um n�mero do conjunto: ");
				int num = entrada.nextInt();
				
				if(contador == 1){
						menor = num;
						maior = num;	
				}else {
					if(num <= menor) {
						menor = num;
						
					}else if(num >= maior) {
						maior = num;
				}
			}
				soma = soma+num;
		}
		 
		
		System.out.println("O menor n�mero � " + menor);
		System.out.println("O maior n�mero � " + maior);
		System.out.println("A soma dos valores do conjunto �:3 " + soma);		
		
		entrada.close();
	
	}
}
