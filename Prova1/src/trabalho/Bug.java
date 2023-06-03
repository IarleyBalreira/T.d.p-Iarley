package trabalho;

import java.util.Random;

public class Bug {

	Random rand = new Random(); 
	
	public int cordX;
	public int cordY;
	public char personagem;
	public Plano plano;
	public int id;
	
	public Bug(int id, int cordX, int cordY ,Plano plano) {
		
		this.id = id;
		
		this.cordX = rand.nextInt(cordX) + 1;
		this.cordY = rand.nextInt(cordY) + 1;
		
		while(this.cordX == 1 && this.cordY == cordY) {
			
			this.cordX = rand.nextInt(cordX) + 1;
			this.cordY = rand.nextInt(cordY) + 1;
			
			}
		
		this.plano = plano;
		this.personagem = 'X';
		
		Celulas colocaBug = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			
			colocaBug = plano.listaCelulas.get(i);
			
			if (colocaBug.posicaoX == this.cordX && colocaBug.posicaoY == this.cordY) {
				
				plano.listaCelulas.get(i).bug = this;
				plano.listaCelulas.get(i).personagem = this.personagem;
				
			}
		}
	
	}
}
