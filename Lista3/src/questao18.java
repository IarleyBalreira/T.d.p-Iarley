import java.util.Scanner;

public class questao18 {

	public static void main(String[] args) {
		System.out.println("informe o valor incial, a taxa de juros e o numero de periodos para o aumento de juros");
		Scanner scan = new Scanner(System.in);
		float valorInicial = scan.nextFloat();
		float taxaJuros = scan.nextFloat();
		int periodo = scan.nextInt();
		System.out.println("o valor final apos a aplicacao dos juros foi de: "+ (valorInicial+Juros(valorInicial, taxaJuros, periodo)));
	}	

	
	public static float Juros(float dindin, float tax, int tempo){
		float montante = dindin*(float)Math.pow(tax + 1, tempo); 
		float juros = montante - dindin;
		return juros;
	}

}
