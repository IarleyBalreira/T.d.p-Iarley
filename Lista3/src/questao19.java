import java.util.Scanner;

public class questao19 {

	public static void main(String[] args) {
		System.out.println("forneca um numero:");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		if(numeroPerfeito(numero))
			System.out.println("o numero eh perfeito!");
		else
			System.out.println("o numero nao eh perfeito");
	}

	public static boolean numeroPerfeito(int perfeito) {
		int soma = 0;
		for(int i = 1; i < perfeito; i++){
			if(perfeito % i == 0)
            soma = soma + i;
        }
		if(soma == perfeito)
		return true;
		
		return false;
	}
}
