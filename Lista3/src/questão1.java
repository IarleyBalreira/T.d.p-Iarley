import java.util.Scanner;
// somatorio
public class questão1 {
	public static void main(String[] args) {
		int tamanho;
		int soma;
		System.out.println("Forneca o tamanho do vetor a ser criado");
		Scanner scan = new Scanner(System.in);
		tamanho = scan.nextInt();
		int[] vetor = new int[tamanho];
		System.out.println("Agora forneca os valores do vetor");
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = scan.nextInt();
		}
		soma = somatorio(vetor , tamanho);
		if(soma == 0)
			System.out.println("O somatorio nao foi possivel devido as restricoes da questao");
		else
			System.out.println("O somatorio do vetor foi igual a: "+ soma);
	}
	
	public static int somatorio(int[] copia, int numeros ) {
		int soma = 0;
		for(int i = 2; i < (numeros-2); i++ ) {
			soma += copia[i];		
		} 
			return soma;
	}

}
