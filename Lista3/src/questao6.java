import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		int tamanho;
		System.out.println("forneca o tamanho do vetor");
		Scanner scan = new Scanner(System.in);
		tamanho = scan.nextInt();
		float[] vetor = new float[tamanho];
		float[] ordenado = new float[tamanho];
		System.out.println("forneca os valores do vetor ");
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = scan.nextFloat();
		}
		ordenado = ordenaVetor(vetor);
		System.out.println("este eh o vetor ordenado em ordem crescente");
		for(int i = 0; i < tamanho; i++) {
			System.out.println(ordenado[i]);
		}
		
	}
	
	public static float[] ordenaVetor(float[] vet) {
		float aux;
		float[] ordem = new float[vet.length];
		for(int cont = 0; cont < vet.length; cont++) {
			for(int i = 0; i < vet.length; i++) {
				if(i != vet.length -1) {
					if(vet[i] > vet[i+1]) {
						aux = vet[i];
						vet[i] = vet[i+1];
						vet[i+1] = aux;	
					}
				}
			}
		}
		ordem = vet;
		return ordem;
	}

}
