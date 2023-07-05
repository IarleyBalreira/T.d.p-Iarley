package controller;

import java.util.ArrayList;
import java.util.Random;

public class Plano {
	
	private int tamanho;
	private ArrayList<Celulas> celulas;
	private int numAlunos;
	private int alunosEncontrados;
	private int bugsEncontrados;
	
	
	private String nomeJogador;
	private int numrodadas;
	
	public Plano(int tamanho, int numAlunos, int numBugs) {
		this.tamanho = tamanho;
		
		numrodadas = 1; 
		
		celulas = new ArrayList<Celulas>();
		
		for(int y = 0; y < tamanho; y++)
			for(int x = 0; x < tamanho; x++)
				celulas.add(new Celulas(x, y));
			
		
		Random aleatorio = new Random();
		ArrayList<Integer> listaNumAleatorios = new ArrayList<>();
		int num;
		
		for( ; listaNumAleatorios.size() < (numBugs + numAlunos); ) {
			do {
				num = aleatorio.nextInt(tamanho*tamanho);
			} while(listaNumAleatorios.contains(num));
			listaNumAleatorios.add(num);
		}
		
		for(int i = 0; i < listaNumAleatorios.size(); i++) {
			if(i < numBugs) {
				celulas.get(listaNumAleatorios.get(i)).addBug();
			} else {
				celulas.get(listaNumAleatorios.get(i)).addAluno();
			}
		}
		
		this.numAlunos = 0;
		for (Celulas celula : this.celulas) {
			if(celula.temAluno()) {
				this.numAlunos++;
			}
		}
		
	} 
	
	public void novaRodada() {
		numrodadas++; 
	}
	
	protected void moverRobo(int coordInicial[], int coordFinal[], Robos robo) {
		
		this.encontrarCelula(coordInicial).removerRobo(robo);
		this.encontrarCelula(coordFinal).addRobo(robo);
	}
	
	
	public void atualizarBugEAlunos() {
		alunosEncontrados = 0;
		bugsEncontrados = 0;
		
		for (Celulas celula : celulas)
			if(celula.roboVisitou()) {
				
				if(celula.temAluno()) 
					alunosEncontrados++;
				
				if(celula.temBug()) 
					bugsEncontrados++;
			}
	}
	
	
	protected int celulasVazias() {
		int cont = 0;
		
		for (Celulas celula : celulas) 
			if(!celula.roboVisitou())   // passa pelas celulas para contar o numero de celulas nao visitadas
				cont++;

		return cont;
	}
	
	
	protected boolean verificaFim() {
		
		int contador=0;
		for (Celulas celula : this.celulas)
			if(celula.roboVisitou() &&  celula.temAluno())
				contador++;
		
		return (contador >= numAlunos);
	}
	
	
	protected void roboVisitouCelula(int coord[]) {
		this.encontrarCelula(coord).setTrueRoboVisitou();
	}
	
	
	protected boolean celulaTemAluno(int coord[]) {
		
		Celulas celulaTemp = encontrarCelula(coord);
			if(celulaTemp.temAluno() && !celulaTemp.roboVisitou()) 
				return true;
		return false;
		
	}
	
	protected boolean celulaTemBug(int coord[]) {
		
		Celulas celulaTemp = encontrarCelula(coord);
			if(celulaTemp.temBug() && !celulaTemp.roboVisitou())
				return true;
		return false;
		
	}
	
	private Celulas encontrarCelula(int[] coord) {
		
		for (Celulas celula : this.celulas)
			if(celula.getCoords()[0] == coord[0] && celula.getCoords()[1] == coord[1]) 
				return celula;
		return null;
	}
	
	public ArrayList<Celulas> getListaCelulas(){
		return this.celulas;
	}
	
	public int alunosResgatados() {
		return alunosEncontrados;
	}

	public int bugsOcorridos() {
		return bugsEncontrados;
	}
	
	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public int getNumRodadas() {
		return numrodadas;
	}

	public int getTamanho() {
		return this.tamanho;
	}
	
}