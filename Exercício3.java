import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nome;
		int idade;
		float salario;
		char sexo, estadocivil;

		while (true) {
			System.out.println("Insira o nome: ");
			nome = entrada.nextLine();
			if (nome.length() > 3) {
				System.out.println("Nome válido.");
				break;
			} else {
				System.out.println("O nome precisa ter mais que 3 caracteres.");
			}
		}

		while (true) {
			System.out.println("Informe uma idade entre 0 a 150: ");
			idade = entrada.nextInt();
			if ((idade > 0) && (idade <= 150)) {
				System.out.println("Idade válida.");
				break;
			} else {
				System.out.println("Idade precisa ser entre 0 a 150");
			}
		}

		while (true) {
			System.out.println("Informe um salário maior que 0: ");
			salario = entrada.nextFloat();
			if (salario > 0) {
				System.out.println("Salario válido.");
				break;
			} else {
			}
		}

		while (true) {
			System.out.println("Informe o sexo. (Digite F- para feminino e M- para masculino): ");
			sexo = entrada.next().charAt(0);
			sexo = (Character.toString(sexo).toUpperCase()).charAt(0);
			if ((sexo == 'M') || (sexo == 'F')) {
				System.out.println("Sexo válido.");
				break;
			} else {
				System.out.println("Sexo inválido!! Digite novamente F- para sexo feminino e M- para sexo masculino: ");
			}
		}

		while (true) {
			System.out.println("Informe um estado civil: solteiro (s), Casado(c), Viúvo (v), Divorciado (d): ");
			estadocivil = entrada.next().charAt(0);
			estadocivil = (Character.toString(estadocivil).toUpperCase()).charAt(0);
			if (estadocivil == 'S'|| estadocivil == 'C' || estadocivil == 'V' || estadocivil == 'D') {
				System.out.println("Estado civil válido.");
				break;
			} else {
				System.out.println("Estado civil inválido.");
			}
		}
			entrada.close();
		}
	}
