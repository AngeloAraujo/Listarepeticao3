import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float somaf = 0, mediaf = 0;
		
		System.out.println("Quantas notas serão lançadas?");
		int cont = entrada.nextInt();
		
		for(int i = 1; i <= cont; i++) {
		System.out.println("Digite a nota:");
		float notaf = entrada.nextFloat();
			somaf += notaf;	
		}
		mediaf = somaf/cont;
		System.out.println("A média das notas foram: " + mediaf);
		
		entrada.close();
	}

}