import java.util.Scanner;
public class Exercício35 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double cachorroquente = 1.20;
		double baurusimples = 1.30;
		double bauruovo = 1.50;
		double hamburguer = 1.20;
		double cheeseburguer = 1.30;
		double refrigerante = 1;
		double totalitem = 0 ;
		double totalcompra = 0;
		
		while(true) {
			System.out.println("Digite o código do produto. (Para encerrar digite 0.)");
			int codigo = entrada.nextInt();
			System.out.println("Digite a quantidade do produto:");
			int quantidade = entrada.nextInt();
			
						
			if(codigo == 100) {
				totalitem = quantidade * cachorroquente;
				totalcompra = totalcompra + totalitem; 
				System.out.println("Item 100: R$ " + totalitem);
			}
			if(codigo == 101) {
				totalitem = quantidade * baurusimples;
				totalcompra = totalcompra + totalitem;
				System.out.println("Item 101: R$ "+ totalitem);
			}
			if(codigo == 102) {
				totalitem = quantidade * bauruovo;
				totalcompra = totalcompra + totalitem;
				System.out.println("Item 102: R$ "+ totalitem);
			}
			if(codigo == 103) {
				totalitem = quantidade * hamburguer;
				totalcompra = totalcompra + totalitem;
				System.out.println("Item 103: R$ "+ totalitem);
			}
			if(codigo == 104) {
				totalitem = quantidade * cheeseburguer;
				totalcompra = totalcompra + totalitem;
				System.out.println("Item 104: R$ "+ totalitem);
			}
			if(codigo == 105) {
				totalitem = quantidade * refrigerante;
				totalcompra = totalcompra + totalitem;
				System.out.println("Item 105: R$ "+ totalitem);
			}
			if(codigo == 0) {
				System.out.println("Compra finalizada");
				break;}
			
	
		}
		System.out.println("Preço total: R$" + totalcompra);
		
		entrada.close();
	}

}
