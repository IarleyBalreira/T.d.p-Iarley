package trabalho;

public class Celulas {

	public int posicaoX;
	public int posicaoY;
	public int id;
	public Robos robo;
	public Bug bug;
	public Alunos aluno;
	public char personagem;

	public Celulas(int id, int x , int y) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		this.robo = null;
		this.bug = null;
		this.aluno = null;
		this.personagem = 'X';
	}
	
	
	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
}

