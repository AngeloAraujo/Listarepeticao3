public class Ex15 {

	public static void main(String[] args) {
		
		int num1 = 38;
		int num2 = 39; 
		int divisor = 0;
		float exponencialf = 0,soma = 0;
		
		
		for(divisor = 1; divisor <= 37; divisor++) {
			num1 = num1-1;
			num2 = num2-1;
			exponencialf = ((num1 * num2)/divisor);
			soma = soma + exponencialf; 
		
		System.out.println("(" +num1 + "*" + num2 + ")/" + divisor + " + "); 
		}
		
		System.out.println("Soma = " + soma);

	}
	
}
