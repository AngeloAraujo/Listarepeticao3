import java.util.Scanner;
public class Ex29 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		
		System.out.println("Informe qual tabuada voce quer saber: ");
		int tab= entrada.nextInt();
		
		System.out.println("Insira o ínicio da tabuada: ");
		int inicio=entrada.nextInt();
		
		System.out.println("Insira o fim da tabuada: ");
		int fim=entrada.nextInt();
		
		System.out.println("Montar a tabuada de :"+ tab);
		System.out.println("Começar por: "+ inicio);
		System.out.println("terminar em: "+ fim);
		System.out.println("Vou começar a tabuada do " + tab+ " iniciando em "+ inicio+ " terminando em "+fim +":");
		
		while(true) {
			if (fim>inicio) {
				for (int i=inicio; i<= fim; i++){
					System.out.println(tab+ " x "+ i +" = "+ (tab*i));}
				break;
			}else
				System.out.println("O valor final precisa ser maior que o inicial.");
			break;
			}
	entrada.close();	
	}
		
		
		
	}


