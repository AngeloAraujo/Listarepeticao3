import java.util.Scanner;
public class Exerc�cio29 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		System.out.println("Informe o n�mero da tabuada");
		int Tab= entrada.nextInt();
		System.out.println("Insira o �nicio da tabuada");
		int inicio=entrada.nextInt();
		System.out.println("Insira o fim da tabuada");
		final int tama=entrada.nextInt();
		
		
		while(true) {
			if (tama>inicio) {
				for (int k=inicio;k<=tama;k++){
					System.out.println(Tab+ " x "+k+" = "+(Tab*k));}
				break;
			}else
				System.out.println("O valor final precisa ser maior que o inicial.");
			break;}
	entrada.close();	
	}
		
		
		
	}


