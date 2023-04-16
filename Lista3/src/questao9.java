import java.util.Scanner;

public class questao9 {

	public static void main(String[] args) {
		int tamanho, k;
		System.out.println("forneca o tamanho do vetor");
		Scanner scan = new Scanner(System.in);
		tamanho = scan.nextInt();
		float[] vetor = new float[tamanho];
		System.out.println("forneca os valores do vetor ");
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = scan.nextFloat();
		}
		System.out.println("informe o numero para k");
		k = scan.nextInt();
		if(k > tamanho)
			System.out.println("nao existe um numero que corresponda a essa posicao!");
		else
			System.out.println("o K-esimo menor valor do vetor fornecido eh "+ kaesimoValor(vetor, k));
	}

	
	public static float kaesimoValor(float[] vet,  int n) {
		float[] copia;
		copia = vet;
		float aux;
		for(int j = 0; j < vet.length; j++) {
			for(int i = 0; i < vet.length; i++) {
				if(i != vet.length -1) {
					if(copia[i] > copia[i+1]) {
						aux = copia[i];
						copia[i] = copia[i+1];
						copia[i+1] = aux;	
					}
				}
			}
		}
		return copia[n-1];
	}
}
