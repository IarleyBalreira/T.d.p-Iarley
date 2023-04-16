import java.util.Scanner;
// contagem de elementos
public class questao4 {

	public static void main(String[] args) {
		float elemento;
		int tamanho1, tamanho2, valorContador;
		System.out.println("forneca o tamanho do primeiro e do segundo vetor");
		Scanner scan = new Scanner(System.in);
		tamanho1 = scan.nextInt();
		tamanho2 = scan.nextInt();
		float[] vetor1 = new float[tamanho1];
		float[] vetor2 = new float[tamanho2];
		System.out.println("defina os valores do vetor 1");
		for(int i = 0; i < tamanho1; i++) {
			vetor1[i] = scan.nextFloat();
		}
		System.out.println("defina os valores do vetor 2");
		for(int i = 0; i < tamanho2; i++) {
			vetor2[i] = scan.nextFloat();
		}
		System.out.println("agora defina o elemento a ser contado");
		elemento = scan.nextFloat();
		valorContador = contador(vetor1, vetor2, elemento);
		if(valorContador == 0)
			System.out.println("o elemento nao aparece nenhuma vez!");
		else if(valorContador == 1)
			System.out.println("o elemento fornecido aparece "+ valorContador + " vez !!!");
		else
			System.out.println("o elemento fornecido aparece "+ valorContador + " vezes !!!");
	}
	
	public static int contador(float[] vet1, float[] vet2, float numero) {
		int cont = 0;
		for(int i = 0; i < vet1.length; i++) {
			if(vet1[i] == numero)
				cont++;
		}
		for(int i = 0; i < vet2.length; i++) {
			if(vet2[i] == numero)
				cont++;
		}
		return cont;
	}

}
