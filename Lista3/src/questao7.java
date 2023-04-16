import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		int tamanho;
		System.out.println("forneca o tamanho do vetor");
		Scanner scan = new Scanner(System.in);
		tamanho = scan.nextInt();
		float[] vetor = new float[tamanho];
		System.out.println("forneca os valores do vetor ");
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = scan.nextFloat();
		}
		if(verificaOrdenado(vetor) == true)
			System.out.println("o vetor esta ordenado em ordem crescente");
		else
			System.out.println("o vetor nao esta bem ordenado");
			
	}

	
	public static boolean verificaOrdenado(float[] vet) {
		for(int i = 1; i < vet.length; i++) {
			if(i != vet.length -1)
			if(vet[i] > vet[i+1]) 
	        return false; 
	    }
	    return true;
	}

}
