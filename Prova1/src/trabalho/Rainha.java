package trabalho;

import java.util.Scanner;

public class Rainha extends Robos{

	int anda;
	Scanner scan = new Scanner(System.in);
	
	int limx = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoX;
	int limy = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoY;
	int auxX = posicaox;
	int auxY = posicaoy;
	
	public Rainha(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy,'2', 0, plano);
		
	}

	public void avancar() {
		System.out.println("Deseja andar quantas celulas ? (1 a 4)");
		anda = scan.nextInt();
		while(anda > 4) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}

		if (super.posicaox + anda < limx && super.posicaoy - anda > 1) {
			
			auxX = super.posicaox + anda;
			auxY = super.posicaoy - anda;
		}

		super.andar(7,'2',auxX,auxY);
	}

	public void retroceder() {
		System.out.println("Deseja andar quantas celulas ? (1 a 4)");
		anda = scan.nextInt();
		while(anda > 4) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}
		
		if (super.posicaox - anda > 1 && super.posicaoy + anda < limy) {
			
			auxX = super.posicaox - anda;
			auxY = super.posicaoy + anda;
		}

		super.andar(7,'2',auxX,auxY);
	}

}
