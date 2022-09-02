import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex27 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		
		int x=0;
		float total=0; 
		float troco=0;
		float valor = 1;
		System.out.println("Lojas Tabajara");
		
		
		while(valor!=0){
			System.out.println("Insira o valor do produto?(Para encerrar digite 0)");
			valor=entrada.nextFloat();
				x++;
			System.out.println("Produto"+x+" - R$"+new DecimalFormat("#,##0.00").format(valor));	
				total+= valor;
		}
		
		 System.out.println("Total da compra: R$ "+new DecimalFormat("#,##0.00").format(total));
		 System.out.println("Valor em dinheiro");
		 double dinheiro=entrada.nextDouble();
		 System.out.println("Pagamento em dinheiro R$: "+new DecimalFormat("#,##0.00").format(dinheiro));
		 troco= (float) (dinheiro-total);
		 System.out.println("Troco R$: "+new DecimalFormat("#,##0.00").format(troco));
		
		entrada.close();
	
	}
}
