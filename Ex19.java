import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int divisao = 0;
		
		System.out.println("Digite um n�mero inteiro:");
		num = entrada.nextInt();
	
		System.out.println("Os n�meros primos entre  1 e "+num + " s�o: " );
		for(int i =1; i <= num;i++) {
			if((i % 2 == 1) && (i != 2) || (i == 2)){
				System.out.print(i + "  \n");
				divisao++;
			}else {
				divisao++;
			}
		}
		System.out.println("O n�mero de divis�es desse n�mero inteiro para encontrar o n�mero primo foi " + divisao);	
		
		entrada.close();
	}
}
