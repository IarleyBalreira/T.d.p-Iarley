package questao5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static float lerFloat() {
		Scanner leitor = new Scanner(System.in);
		return leitor.nextFloat();
	}
	
	public static String lerString(){
	    Scanner leitor = new Scanner(System.in);
	    return leitor.nextLine();
	}
	
	public static int lerInt() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }
	
	public static void main(String[] args) {
		ArrayList<Contato> contatos = new ArrayList<>();
		for (int i = 0; i <= 5; i++) {
			// item A
			
			System.out.println("Digite os dados para o " + (i+1 )+" contato: ");
			System.out.println("Código: ");
			float codigo = lerFloat();
			
			System.out.println("Nome: ");
			String nome = lerString();
			
			System.out.println("Endereco: ");
			String endereco = lerString();
			
			System.out.println("E-mail: ");
			String e_mail = lerString();
			
			System.out.println("Telefone: ");
			int telefone = lerInt();
			
			System.out.print("Observacao: ");
			String observacao = lerString();
			
			Contato contato = new Contato(codigo, nome, e_mail);
			contato.setEndereco(endereco);
			contato.setTelefone(telefone);
			contato.setObservacao(observacao);
			contato.mostrarContato();
			// cria o objeto
			
			if (contato.estaPreenchido()) {
				System.out.println("O contato esta totalmente preenchido");
			}
			else{
				System.out.println("O contato nao esta preenchido totalmente");
			}
			// confere se o contato esta preenchido
			
			contatos.add(contato);
			// adiciona o contato no array
			
			System.out.println("O contato duplicado é: ");
			Contato novoContato = contato.duplicaContato();
			novoContato.mostrarContato();
			// mostra o contato duplicado
		}
		
	}
	
}
