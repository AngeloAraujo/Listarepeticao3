import java.util.Scanner;
public class Ex32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int codigocidade=0;
		int cidade=0;
		int cidademaior = 0;
		int cidademenor=0;
		int cidademenos = 0;
		float quantidadetotal=0;
		float quantidademenosveiculos = 0;
		float quantidadeveiculos=0;
		float quantidadeacidentes=0;
		float acidentesmaior=0;
		float acidentesmenor=999;
		float mediamenor=0;
		
		while(cidade<3) {
			System.out.println("Digite o c�digo da cidade: ");
				codigocidade = entrada.nextInt();
			System.out.println("Digite a quantidade de veiculos de passeios em 1999: ");
			 	quantidadeveiculos = entrada.nextInt();
			 System.out.println("Digite a quantidade de acidentes de transito com v�timas em 1999: ");
			 	quantidadeacidentes=entrada.nextFloat();
		
			 	cidade++;
			 	quantidadetotal=quantidadeveiculos+quantidadetotal;
		
		if (quantidadeacidentes<acidentesmenor) {
			cidademenor=codigocidade;
			acidentesmenor=quantidadeacidentes; 	
		}
		
		if (quantidadeacidentes>acidentesmaior) {
			cidademaior=codigocidade;
			acidentesmaior=quantidadeacidentes; 	
		}
				
		if (quantidadeveiculos<2000) {
			quantidademenosveiculos=quantidadeveiculos+quantidademenosveiculos;
			cidademenos++;
			mediamenor=(quantidademenosveiculos/cidademenos);
		}
		
	}
		System.out.println("A cidade "+cidademaior+" � a cidade com a maior quantidade de acidentes com "+acidentesmaior);
		System.out.println("A cidade "+cidademenor+" � a cidade com a menor quantidade de acidentes com "+acidentesmenor);
		System.out.println("A m�dia de ve�culos das 5 cidades juntas � "+(quantidadetotal/cidade));
		System.out.println("A m�dia de acidentes nas cidades com menos de 2000 ve�culos � "+mediamenor);
		
		entrada.close();
	}
}
