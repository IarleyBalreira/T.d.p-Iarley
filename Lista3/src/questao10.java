import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		int tamanho1, tamanho2;
		boolean verificado;
		System.out.println("forneca o tamanho dos vetores");
		Scanner scan = new Scanner(System.in);
		tamanho1 = scan.nextInt();
		tamanho2 = scan.nextInt();
		float[] vetor1 = new float[tamanho1];
		float[] vetor2 = new float[tamanho2];
		System.out.println("forneca os valores dos vetores");
		System.out.println("primeiro vetor ");
		for(int i = 0; i < tamanho1; i++) {
			vetor1[i] = scan.nextFloat();
		}
		System.out.println("segundo vetor ");
		for(int i = 0; i < tamanho2; i++) {
			vetor2[i] = scan.nextFloat();
		}
		if(tamanho1 != tamanho2) 
			System.out.println("os vetores sao diferentes");
		else {
			if(verifica(vetor1, vetor2) == true)
				System.out.println("os vetores sao iguais");
			else
				System.out.println("os vetores sao diferentes");
		}
		
	}
	
	
	public static boolean verifica(float[] vet1, float[] vet2) {
		boolean igualdade;
		int cont = 0;
		for(int i = 0; i < vet1.length; i++) {
			if(vet1[i] == vet2[i])
				cont++;
			else
				cont--;
		}
		if(cont == vet1.length)
			return igualdade = true;
		else
			return igualdade = false;
	}

}
