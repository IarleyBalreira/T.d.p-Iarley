import java.util.Scanner;

public class questao16 {

	public static void main(String[] args) {
		System.out.println("insira um numero:");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		if(primoVerifica(numero))
		System.out.println("o numero eh primo");
		else
		System.out.println("o numero nao eh primo");	
	}
	
	public static boolean primoVerifica(int valor){
		
		int verificador = 1;
		int cont =  0;
		for( ; verificador <= valor; verificador++) {
			if(valor % verificador == 0)
				cont++;	
		}
		if(cont == 2)
			return true;
		else 
			return false;
	}
}
