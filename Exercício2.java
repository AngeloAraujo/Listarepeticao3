import java.util.Scanner;
public class Exerc�cio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome de usu�rio: ");
		String usuario = entrada.nextLine();
		System.out.println("Informe a senha: ");
		String senha = entrada.nextLine();

		while (usuario.equalsIgnoreCase(senha)) {
			System.out.println("A senha n�o pode ser igual ao nome de usu�rio! Digite novamente.");
			System.out.println("Informe um nome de usu�rio: ");
			usuario = entrada.nextLine();
			System.out.println("Informe uma senha: ");
			senha = entrada.nextLine();
		}
		entrada.close();
	}
}
