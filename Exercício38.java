import java.util.Scanner;
public class Exerc�cio38 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero positivo:");
		int num = entrada.nextInt();
		int num1 =num;
		int maximo = 10;
		int numerofinal = 0; 
		
		while(num != 0 ) {
			num%= maximo;
			numerofinal+= num;
			numerofinal *= 10;
			num1-=num;
			num1/=10;
			num=num1;
		}
		numerofinal/=10;
		
		System.out.println(numerofinal);
		entrada.close();
	}

}
