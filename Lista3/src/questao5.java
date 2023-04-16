import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		int tamanho;
		System.out.println("forneca o tamanho do vetor");
		Scanner scan = new Scanner(System.in);
		tamanho = scan.nextInt();
		float[] vetor = new float[tamanho];
		float[] copiado = new float[tamanho];
		System.out.println("forneca os valores do vetor ");
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = scan.nextFloat();
		}
		copiado = copia(vetor);
		System.out.println("vetor copia: ");
		for(int i = 0; i < tamanho; i++) {
			System.out.println(copiado[i]);
		}
	}
	
	public static float[] copia(float[]vet) {
		float[] vetorCopia = new float[vet.length];
		vetorCopia = vet;
		return vetorCopia;
	}
}
