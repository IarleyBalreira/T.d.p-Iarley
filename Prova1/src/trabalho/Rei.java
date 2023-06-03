package trabalho;

import java.util.Scanner;

public class Rei extends Robos{

	int anda;
	Scanner scan = new Scanner(System.in);
	
	int limx = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoX;
	int limy = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoY;
	int auxX = posicaox;
	int auxY = posicaoy;
			
	public Rei(int id, String nome, int posicaox, int posicaoy,Plano plano) {
		super(id, nome, posicaox, posicaoy,'1', 0, plano);
		
	}

	public void avancar() {
		System.out.println("Deseja andar quantas celulas ? (1 a 4)");
		anda = scan.nextInt();
		while(anda > 4) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}
		if (super.posicaox - anda > 1 && super.posicaoy - anda > 1) {
			
			auxX = super.posicaox - anda;
			auxY = super.posicaoy - anda;
		}

		super.andar(6,'1',auxX,auxY);
		}

	public void retroceder() {
		
		System.out.println("Deseja andar quantas celulas ? (1 a 4)");
		anda = scan.nextInt();
		while(anda > 4) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}
		
		if (posicaox + anda < limx && posicaoy + anda < limy) {
			
			auxX = super.posicaox + anda;
			auxY = super.posicaoy + anda;
		}

		super.andar(6,'1',auxX,auxY);

	}

}
