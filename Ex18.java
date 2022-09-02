import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número inteiro:");
		num = entrada.nextInt();
	
		if((num % 2 == 0) && (num !=2)) {
			System.out.println(num + " não é um número primo");
		}else {
			System.out.println(num + " é um número primo");
		}
		
		System.out.print("Ele é divisível pelos seguintes números: ");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0)
			System.out.print(i + "  "); 	
		}
		entrada.close();		
		
	}
	
}

