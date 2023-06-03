package trabalho;

import java.util.Scanner;

public class Cavalo extends Robos{

	int limx = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoX;
	int limy = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoY;
	int auxX = posicaox;
	int auxY = posicaoy;
	int anda;
	Scanner scan = new Scanner(System.in);
	
	public Cavalo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy,'4', 0, plano);
		
	}
	

	public void avancar() {

		System.out.println("Deseja andar quantas celulas ? (1 a 2)");
		anda = scan.nextInt();
		while(anda > 2) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}
		if (auxX > 1 && auxY > 1) {
			auxX = super.posicaox - anda;
			auxY = super.posicaoy - anda;
		}

		super.andar(5,'4',auxX,auxY);
	}

	public void retroceder() {
		System.out.println("Deseja andar quantas celulas ? (1 a 2)");
		anda = scan.nextInt();
		while(anda > 2) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}
		if (auxX < limx && auxY < limy) {
			auxX = super.posicaox + anda;
			auxY = super.posicaoy + anda;
		}

		super.andar(5,'4',auxX,auxY);

	}

}
