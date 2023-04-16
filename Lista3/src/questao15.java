import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {
		System.out.println("Coloque uma palavra:");
		Scanner scan = new Scanner(System.in);
		String palavra = scan.nextLine();
		if(palindromo(palavra))
			System.out.println("A palavra fornecida eh um palindromo");
		else
			System.out.println("A palavra fornecida nao eh um palindromo");
	}
	
	
	public static boolean palindromo(String palavra){
		int numCaracteres = palavra.length()-1;
		char[] letraPalavra = new char[palavra.length()];
		palavra.getChars(0, palavra.length(), letraPalavra, 0);
		for(int i = 0, j = numCaracteres; i <= numCaracteres && j >= 0; i++, j--){
			if(letraPalavra[i] != letraPalavra[j])
			return false;
		}
		return true;
	}

}
