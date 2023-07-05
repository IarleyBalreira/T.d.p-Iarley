package controller;

import java.awt.Color;

public abstract class Robos implements RobosInterface{
	
	private Plano plano;
	private String nome;
	private int coordRobo[];
	private int pontuacao;
	private int alunosSalvos;
	private int bugsEncontrados;
	private Color corRobo;
	
	public Robos(String nome, Plano plano, int vermelho, int verde, int azul) {
		
		this.nome = nome;
		this.plano = plano;
		coordRobo = new int[2];	 coordRobo[0] = 0; coordRobo[1] = 0;
		alunosSalvos = 0;
		bugsEncontrados = 0;
		pontuacao = 0;
		corRobo = new Color(vermelho, verde, azul);
		
	} 
	
	
	public void receberCoord(int[] coord) {
		
		this.coordRobo[0] = coord[0];
		this.coordRobo[1] = coord[1];
		
	}
	
	
	protected int[] movimentarRobo(int coordInicial[], int coordFinal[]) {

			if(coordInicial[0] == coordFinal[0] && coordInicial[1] == coordFinal[1]) { 
				return coordInicial;
			} else {
				plano.moverRobo(coordInicial, coordFinal, this);
				this.verificaAlunoeBug(coordFinal);
				return coordFinal;
			}
				
	}

	protected void concluirMov() {
		
			plano.roboVisitouCelula(coordRobo);
	}
	
	protected void setCorRobo(Color corRobo) {
		
		this.corRobo = corRobo;
	}
	
	private void verificaAlunoeBug(int coord[]) {
		
		if(plano.celulaTemAluno(coord)) {
			
			this.atualizarPontuacao(10, true);
			alunosSalvos++;
		}
		
		if(plano.celulaTemBug(coord)) {
			this.atualizarPontuacao(15, false);
			bugsEncontrados++;
		}
		
	}
	
	private void atualizarPontuacao(int qtd, boolean ganhou) {
		
		if(ganhou)
			pontuacao+=qtd;   // achou aluno
		else
			pontuacao-=qtd;  // achou bug
		
	}
	
	protected void setCoordRobo(int coord[]) {
		
		this.coordRobo[0] = coord[0];
		this.coordRobo[1] = coord[1];
	}
	
	
	protected int[] getCoordRobo() {
		return coordRobo;
	}

	public int getPontuacao() {
		return pontuacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	protected int getQtdAlunosColetados() {
		return alunosSalvos;
	}
	
	protected int getQtdBugsColetados() {
		return bugsEncontrados;
	}

	public Color getCorRobo() {
		return corRobo;
	}
	
}