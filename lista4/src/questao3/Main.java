package questao3;

import java.util.Scanner;

public class Main {

	public static float lerFloat(){
        Scanner scan = new Scanner(System.in);
        return scan.nextFloat();
	}
	public static String lerString(){
	    Scanner scan = new Scanner(System.in);
	    return scan.nextLine();
	}
	public static int lerInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
	
	public static void main(String[] args) {
		System.out.println("Digite o numero do item: ");
		int numero = lerInt();
		
		System.out.println("Digite a descricao do item: ");
		String descricao = lerString();
		
		System.out.println("Digite a quantidade comprada do item: ");
		int quantidade = lerInt();
		
		System.out.print("Digite o preco unitario do item: ");
		float preco = lerFloat();
		
		Fatura fatura1 = new Fatura(numero, descricao, quantidade, preco);
		System.out.println("O valor da fatura eh:"+ fatura1.getValorFatura());
	}

	
}
