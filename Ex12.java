import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

    int num1 = 1, num2 = 0;

    System.out.println("Insira o n-ésimo termo:");
	int nesimo = entrada.nextInt();  
	
	System.out.println(num2);
	System.out.println(num1);
		        
	for(int i = 0; i < nesimo; i++){
	num1 = num1 + num2;
	num2 = num1 - num2;
	System.out.println(num1);
	}
	entrada.close();
}   
}
	

