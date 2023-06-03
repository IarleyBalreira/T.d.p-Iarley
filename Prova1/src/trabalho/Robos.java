package trabalho;

import java.util.ArrayList;

public abstract class Robos implements Movimento{
	
	public int id;
	public String nome;
	public int posicaox;
	public int posicaoy;
	public ArrayList<Integer> cordx;
	public ArrayList<Integer> cordy;
	public Plano plano;
	private int pontos;
	private static int totalPontos;
	public char personagem;
	public int encontrouBug;
	public int encontrouAluno;
	

	public Robos(int id, String nome, int posicaox, int posicaoy, char personagem , int pontos,Plano plano) {
		this.id = id;
		this.nome = nome;
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		this.personagem = personagem;
		this.pontos = 0;
		this.plano = plano;
		
		cordx = new ArrayList<Integer>();
		cordx.add(posicaox);
		cordy = new ArrayList<Integer>();
		cordy.add(posicaoy);

		Celulas aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
				plano.listaCelulas.get(i).robo = this;
				plano.listaCelulas.get(i).personagem = this.personagem;
			}
		}
	}
	
	public void andar(int id, char imagem, int x, int y) {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null && plano.listaCelulas.get(i).robo.id == id) {
				
				plano.listaCelulas.get(i).robo = null;
				plano.listaCelulas.get(i).personagem = '.';
				
			}

			if (plano.listaCelulas.get(i).posicaoX == x && plano.listaCelulas.get(i).posicaoY == y) {
				
				posicaox = plano.listaCelulas.get(i).posicaoX;
				posicaoy = plano.listaCelulas.get(i).posicaoY;
				cordx.add(posicaox);
				cordy.add(posicaoy);
				
				plano.listaCelulas.get(i).robo = this;
				plano.listaCelulas.get(i).personagem = imagem;
				
				verificacao(plano.listaCelulas.get(i), posicaox, posicaoy);
				
			}
		}
	}
	public static int getTotalPontos() {
		return totalPontos;
	}

	public static void setTotalPontos(int totalPontos) {
		Robos.totalPontos += totalPontos;
	}
	
	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos += pontos;
	}

	public void verificacao(Celulas aux, int x, int y) {
		
		if (aux.aluno != null && aux.aluno.cordX == x && aux.aluno.cordY == y) {
			
			this.setPontos(10);
			Robos.setTotalPontos(10);
			aux.aluno.personagem = '.';
			aux.aluno = null;
			plano.numAlunos--;
			encontrouAluno++;
			System.out.println("Encontou aluno!!!");
		}

		if (aux.bug != null && aux.bug.cordX == x && aux.bug.cordY == y) {
			
			this.setPontos(-15);
			Robos.setTotalPontos(-15);
			aux.bug.personagem = '☻';
			aux.bug = null;
			this.plano.teveBug++;
			encontrouBug++;
			System.out.println("Ataque de bugs !!!");
		}
		
	}
	
	/*
	public void moverEsquerda() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {

			if (plano.listaCelulas.get(i).robo != null) {
				plano.listaCelulas.get(i).robo = null;
				plano.listaCelulas.get(i - 1).robo = this;
			}
		}

	}

	public int moverDireita() {
		return posicaox + 1;
	}
	*/
	
}
