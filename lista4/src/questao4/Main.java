package questao4;

import java.util.Scanner;

public class Main {

	public static String lerString(){
	    Scanner scan = new Scanner(System.in);
	    return scan.nextLine();
	}
	public static int lerInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
	
	public static void main(String[] args) {
		System.out.print("Digite o nome do produto: ");
		String nome = lerString();
		
		System.out.print("Digite o preco do produto: ");
		int preco = lerInt();
		
		System.out.print("Digite a quantidade: ");
		int quantidade = lerInt();
		
		Produto produto1 = new Produto(nome, preco, quantidade);
		produto1.comprarProduto();
		
	}
	
}
