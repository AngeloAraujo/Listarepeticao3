import java.text.DecimalFormat;

public class Ex25 {

	public static void main(String[] args) {
		
		System.out.println("Loja Quase Dois - Tabela de Preços");
		int x=0;
		double produtos;
		
			
		while(x>=0 && x<50) {
			x++;
			produtos=(x*1.99);
			System.out.println("Quantidade de produtos "+x+" valor R$= "+new DecimalFormat("#,##0.00").format(produtos)+".");
		}
		}
			

	}


