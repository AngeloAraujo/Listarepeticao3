import java.util.Scanner;
public class Exercício27 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		
		int x=0;
		float total=0, troco, valor = 1;
		System.out.println("Lojas Tabajara");
		
		
		while(valor!=0){
			System.out.println("Insira o valor do produto?(Para encerrar digite 0)");
			valor=entrada.nextFloat();
			++x;
			System.out.println("Produto"+x+" - R$"+valor);	
			total=(total+valor);
		};
		 System.out.println("Total da compra: R$ "+total);
			System.out.println("Valor em dinheiro");
			double dinheiro=entrada.nextDouble();
			System.out.println("Pagamento em dinheiro R$: "+dinheiro);
			troco= (float) (dinheiro-total);
			System.out.println("Troco R$: "+troco);
		
		entrada.close();
	
	}
}
