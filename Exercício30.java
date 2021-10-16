import java.util.Scanner;
public class Exerc�cio30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int codigogordo=0, codigomagro=0, codigoalto=0, codigobaixo=0;
		
		double pesoGordo = Double.MIN_VALUE;
		double pesoMagro = Double.MAX_VALUE;
		double alturamaisalto = Double.MIN_VALUE;
		double alturamaisbaixo = Double.MAX_VALUE;
		double pesototal=0;
		
		int k=0;
		while (true) {
		    System.out.print("C�digo cliente: ");
		    int codigocliente = entrada.nextInt();
		    if (codigocliente == 0) 
		      	break;
		   
		    k++;	   
		    System.out.print("Altura: ");
		    double altura = entrada.nextDouble();
		    System.out.print("Peso: ");
		    double peso = entrada.nextDouble();
		    pesototal+=peso;
		    
		    if (peso > pesoGordo) {
		        codigogordo = codigocliente;
		        pesoGordo = peso;
		    }
		    if (peso < pesoMagro) {
		        codigomagro = codigocliente;
		        pesoMagro = peso;
		    }
		    if (altura > alturamaisalto) {
		        codigoalto = codigocliente;
		        alturamaisalto = altura;
		    }
		    if (altura < alturamaisbaixo) {
		        codigobaixo = codigocliente;
		        alturamaisbaixo = altura;
		    }
		   
		}
		
		System.out.println("O mais gordo � o:"+codigogordo);
		System.out.println("O mais leve � o : "+codigomagro);
		System.out.println("O mais baixo � o: "+codigobaixo);
		System.out.println("O mais alto � o: "+codigoalto);
		System.out.println("A m�dia de peso �: "+(pesototal/k));
	
		entrada.close();
	}

}
