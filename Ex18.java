import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um n�mero inteiro:");
		num = entrada.nextInt();
	
		if((num % 2 == 0) && (num !=2)) {
			System.out.println(num + " n�o � um n�mero primo");
		}else {
			System.out.println(num + " � um n�mero primo");
		}
		
		System.out.print("Ele � divis�vel pelos seguintes n�meros: ");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0)
			System.out.print(i + "  "); 	
		}
		entrada.close();		
		
	}
	
}

