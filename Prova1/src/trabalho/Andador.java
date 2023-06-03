package trabalho;

import java.util.Scanner;

public class Andador extends Robos{

	int lim = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoY;
	int anda;
	Scanner scan = new Scanner(System.in);
	
	public Andador(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, '0', 0, plano);
		
		
	}

	public void avancar() {

		System.out.println("Deseja andar quantas celulas ?");
		anda = scan.nextInt();
		while(anda > plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoY+1) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}
		if (super.posicaoy <= lim && super.posicaoy > 1)
			super.posicaoy = super.posicaoy - anda;

		if (super.posicaoy > lim && super.posicaoy > 1)
			super.posicaoy = lim;
		else if (super.posicaoy < lim && super.posicaoy < 1)
			super.posicaoy = 1;

		super.andar(1,'0',1,super.posicaoy);

	}

	public void retroceder() {
		
		System.out.println("Deseja andar quantas celulas ?");
		anda = scan.nextInt();
		while(anda > plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoY+1) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}
		if (super.posicaoy <= lim && super.posicaoy > 1)
			super.posicaoy = super.posicaoy + anda;

		if (super.posicaoy > lim && super.posicaoy > 1)
			super.posicaoy = lim;
		else if (super.posicaoy < lim && super.posicaoy < 1)
			super.posicaoy = 1;

		super.andar(1,'0',1,super.posicaoy);
	}

	
}
