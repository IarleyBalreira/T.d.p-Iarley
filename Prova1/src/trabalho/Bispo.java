package trabalho;

import java.util.Scanner;

public class Bispo extends Robos{

	int anda;
	Scanner scan = new Scanner(System.in);
	
	int limx = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoX;
	int limy = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoY;
	int auxX = posicaox;
	int auxY = posicaoy;
	
	public Bispo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy,'3', 0, plano);
	}

	
	public void avancar() {

		System.out.println("Deseja andar quantas celulas ? (1 a 2)");
		anda = scan.nextInt();
		while(anda > 2) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}
		if (auxX < limx && auxY > 1) {
			auxX = super.posicaox + anda;
			auxY = super.posicaoy - anda;
		}

		super.andar(4,'3',auxX,auxY);
	}

	public void retroceder() {
		
		System.out.println("Deseja andar quantas celulas ? (1 a 2)");
		anda = scan.nextInt();
		while(anda > 2) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}
		if (auxX > 1 && auxY < limy) {
			auxX = super.posicaox - anda;
			auxY = super.posicaoy + anda;
		}

		super.andar(4,'3',auxX,auxY);
	}

}
