import java.util.Scanner;
//media
public class questao2 {

	public static void main(String[] args) {
		int tamanho1, tamanho2;
		float valorMedia;
		System.out.println("forneca o tamanho do primeiro e do segundo vetor");
		Scanner scan = new Scanner(System.in);
		tamanho1 = scan.nextInt();
		tamanho2 = scan.nextInt();
		System.out.println("defina os valores do vetor 1");
		int[] vetor1 = new int[tamanho1];
		int[] vetor2 = new int[tamanho2];
		for(int i = 0; i < tamanho1; i++) {
			vetor1[i] = scan.nextInt();
		}
		System.out.println("defina os valores do vetor 2");
		for(int i = 0; i < tamanho2; i++) {
			vetor2[i] = scan.nextInt();
		}
		valorMedia = media(vetor1, vetor2);
		System.out.println("A media obtida foi: "+ valorMedia);

	}
	
	
	public static float media(int[] copia1, int[] copia2) {
		float soma = 0;
		for(int i = 0; i < copia1.length; i++) {
			soma += copia1[i];
		}
		for(int i = 0; i < copia2.length; i++) {
			soma += copia2[i];
		}
		soma = soma/(copia1.length + copia2.length);
		return soma;
	}

}
