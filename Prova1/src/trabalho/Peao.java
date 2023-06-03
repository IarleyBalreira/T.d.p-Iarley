package trabalho;

public class Peao extends Robos {
// limite que impede de avancar alem do plano
	int lim = plano.listaCelulas.get(plano.listaCelulas.size() - 1).posicaoX;
	
	public Peao(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy,'6', 0, plano);
		
	}

	public void avancar() {
		if (super.posicaox <= lim && posicaox > 1)
			super.posicaox += 1;
		
		super.andar(2,'6',posicaox,posicaoy);

	}
	
	public void retroceder() {	
		if (posicaox <= lim && posicaox > 1)
			super.posicaox = posicaox-1;
		
		super.andar(2,'6', posicaox,posicaoy);

	}

}
