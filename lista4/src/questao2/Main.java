package questao2;

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
    
	public static void main(String[] args) {
		System.out.println("Digite o nome do primeiro empregado: ");
		String nome = lerString();
		System.out.println("Digite o sobrenome do segundo empregado: ");
		String sobrenome = lerString();
		System.out.println("Digite o salário do primeiro empregado: ");
		float salario = lerFloat();
		Empregado empregado1 = new Empregado(nome, sobrenome, salario);
		
		System.out.println("Digite o nome do segundo empregado: ");
		String nome2 = lerString();
		System.out.println("Digite o sobrenome do segundo empregado: ");
		String sobrenome2 = lerString();
		System.out.println("Digite o salário do segundo empregado: ");
		float salario2 = lerFloat();
		Empregado empregado2 = new Empregado(nome2, sobrenome2, salario2);
		
		System.out.println("Empregado 1: ");
		empregado1.mostrarInformacoes();
		
		System.out.println("Empregado 2: ");
		empregado2.mostrarInformacoes();
		
		empregado1.aumentaSalario10();
		empregado2.aumentaSalario10();
		
		System.out.println("Depois do aumento o resultado para o empregado 1 fica: ");
		empregado1.mostrarInformacoes();
		System.out.println("Depois do aumento o resultado para o empregado 2 fica: ");
		empregado2.mostrarInformacoes();
		
		
	}

}
