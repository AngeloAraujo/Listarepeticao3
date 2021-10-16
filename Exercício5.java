import java.util.Scanner;
public class Exercício5 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		final int MAX = 20;
		
		for(int i = 1; i <= MAX; i++) { 
			System.out.println(i);
		}
		for(int i = 1; i <= MAX; i++) { 
			System.out.print(i+",");
		}
	entrada.close();
	}
}
