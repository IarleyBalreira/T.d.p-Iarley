import java.util.Scanner;

public class questao17 {

	public static void main(String[] args) {
		System.out.println("digite a palavra a ser invertida:");
		Scanner scan = new Scanner(System.in);
		String palavra = scan.nextLine();
		System.out.println("esta eh a forma invertida da palavra");
		System.out.println(inverte(palavra));
	}
	
	
	public static char[] inverte(String palavra) {
		int numLetras = palavra.length()-1;
		char[] letras = new char[palavra.length()];
		char[] invertida = new char[palavra.length()];
		palavra.getChars(0, palavra.length(), letras, 0);
		for(int i=0, j=numLetras;i<=numLetras && j>=0;i++, j--) {
			invertida[i] = letras[j];
		}
		
		return invertida;
	}
}
