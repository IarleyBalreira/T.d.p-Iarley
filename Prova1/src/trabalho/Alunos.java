package trabalho;

import java.util.Random;

public class Alunos {

	Random randNum = new Random(); 
	
	public char personagem;
	public int cordX;
	public int cordY;
	public Plano plano;
	public int id;
	
	public Alunos(int id, int cordX, int cordY, Plano plano) {
		
		this.id = id;
		
		this.cordX = randNum.nextInt(cordX) + 1;
		this.cordY = randNum.nextInt(cordY) + 1;
		
		while(this.cordX == 1 && this.cordY == cordY) {
			this.cordX = randNum.nextInt(cordX) + 1;
			this.cordY = randNum.nextInt(cordY) + 1;
			}
		
		this.plano = plano;
		this.personagem = 'X';
		plano.numAlunos++;

		Celulas colocaAluno = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			colocaAluno = plano.listaCelulas.get(i);
			if (colocaAluno.posicaoX == this.cordX && colocaAluno.posicaoY == this.cordY) {
				plano.listaCelulas.get(i).aluno = this;
				plano.listaCelulas.get(i).personagem = this.personagem;
			}
		}
	}
	
	
}
