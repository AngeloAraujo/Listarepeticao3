import java.util.Scanner;
public class Exercício26 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		System.out.println("Insira o valor do pão?");
		double valor= entrada.nextDouble();
		int x=0;
		double produtos;
		System.out.println("Preço do pão:"+valor);
		System.out.println("Panificadora Pão de Ontem -Tabela de preços");
			
		while(x>=0 && x<50) {
			++x;
			produtos=(x*valor);
			System.out.println(x+" - R$"+produtos);
		}
		entrada.close();
	}

}
