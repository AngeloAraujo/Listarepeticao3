import java.util.Scanner;
public class Exerc�cio26 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		System.out.println("Insira o valor do p�o?");
		double valor= entrada.nextDouble();
		int x=0;
		double produtos;
		System.out.println("Pre�o do p�o:"+valor);
		System.out.println("Panificadora P�o de Ontem -Tabela de pre�os");
			
		while(x>=0 && x<50) {
			++x;
			produtos=(x*valor);
			System.out.println(x+" - R$"+produtos);
		}
		entrada.close();
	}

}
