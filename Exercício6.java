import java.util.Scanner;
public class Exercício6 {
 ;

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
				
		final int total = 50;
		
		
		for(int impar = 1; impar <= total; impar++) { 
			if (impar%2 != 0)
			System.out.println(impar);
		}
		
		entrada.close();
}
}	