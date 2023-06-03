package trabalho;

import java.util.Scanner;

public class Torre extends Robos{

	
	int lim = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoY;
	int anda;
	Scanner scan = new Scanner(System.in);
	
	public Torre(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy,'5', 0, plano);

		
	}


	public void avancar() {
		
		System.out.println("Deseja andar 1 ou 2 celulas ?");
		anda = scan.nextInt();
		while(anda < 1 || anda > 2) {
			System.out.println("erro! digite corretamente");
			anda = scan.nextInt();
		}

		if (super.posicaoy <= lim && super.posicaoy > 1)
			super.posicaoy = super.posicaoy - anda;

		if (super.posicaoy > lim && super.posicaoy > 1)
			super.posicaoy = lim;
		else if (super.posicaoy < lim && super.posicaoy < 1)
			super.posicaoy = 1;

		super.andar(3,'5',super.posicaox,super.posicaoy);
	}

	public void retroceder() {
		System.out.println("Deseja andar 1 ou 2 celulas ?");
		anda = scan.nextInt();
		while(anda < 1 || anda > 2) {
			System.out.println("erro! digite corretamente");
		}

		if (super.posicaoy <= lim && super.posicaoy > 1)
			super.posicaoy = super.posicaoy + anda;

		if (super.posicaoy > lim && super.posicaoy > 1)
			super.posicaoy = lim;
		else if (super.posicaoy < lim && super.posicaoy < 1)
			super.posicaoy = 1;

		super.andar(3,'5',posicaox,posicaoy);
	}


}
