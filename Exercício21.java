import java.util.Scanner;
public class Exerc�cio21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float somaf = 0, mediaf = 0;
		
		System.out.println("Quantas pessoas ser�o?");
		int cont = entrada.nextInt();
		
		for(int i = 1; i <= cont; i++) {
		System.out.println("Digite a idade:");
		int idade = entrada.nextInt();
			somaf = somaf + idade;	
		}
		mediaf = somaf/cont;
		System.out.println("M�dia: " + mediaf);
		
		if((mediaf >= 0) && ( mediaf <= 25))
			System.out.println("Essa turma � jovem");
		else if((mediaf >= 26) && ( mediaf <= 60))
			System.out.println("Essa turma � adulta");
		else if(mediaf > 60)
			System.out.println("Essa turma � idosa");	

		entrada.close();
	}

}
