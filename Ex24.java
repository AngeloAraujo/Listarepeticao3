import java.util.Scanner;
public class Ex24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valortotal = 0, media = 0;
		
		System.out.println("Quantos CDs são ?");
		int cd = entrada.nextInt();
		
		for(int i = 1; i <= cd; i++) {
			System.out.println("Digite o valor de cada Cd :");
			double valor = entrada.nextDouble();
			valortotal +=  valor;	
		}
		media =  (valortotal/(double)cd);
		System.out.println("Valor total investido: R$ " + valortotal);
		System.out.println("Média de valor gasto em cada CD: R$ " + media);
		
		entrada.close();
	}

}
