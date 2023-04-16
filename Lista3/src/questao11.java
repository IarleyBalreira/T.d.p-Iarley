import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
		System.out.println("informe o numero que sera a base");
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		System.out.println("informe o expoente");
		int expoente = scan.nextInt();
		System.out.println("o valor da potencia eh: "+ valorPotencia(base,expoente));
		}	

	
		public static int valorPotencia(int valorB, int pot){
			int valorPot =1;
			for(int i = 0; i < pot; i++){
				valorPot *= valorB;
			}	
			return valorPot;
		}

	}
