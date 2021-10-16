import java.util.Scanner;
public class Exercício2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome de usuário: ");
		String usuario = entrada.nextLine();
		System.out.println("Informe a senha: ");
		String senha = entrada.nextLine();

		while (usuario.equalsIgnoreCase(senha)) {
			System.out.println("A senha não pode ser igual ao nome de usuário! Digite novamente.");
			System.out.println("Informe um nome de usuário: ");
			usuario = entrada.nextLine();
			System.out.println("Informe uma senha: ");
			senha = entrada.nextLine();
		}
		entrada.close();
	}
}
