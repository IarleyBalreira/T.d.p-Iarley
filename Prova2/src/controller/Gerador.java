package controller;

import java.util.ArrayList;

import view.JanelaRelatorio;
import view.Janela;
import model.*;

public final class Gerador {
	
	private ArrayList<RobosAbstract> arrayRobos;
	private Plano plano;
	private Janela intGraf;
	
	private Escrita escreverDados;
	private Leitura lerDados;
	
	public Gerador() {
		
		int tamanhoTabuleiro = 8;
		int numAlunos = 7;
		int numBugs = 10;
		
		escreverDados = new Escrita();
		lerDados = new Leitura();
		
		plano = new Plano(tamanhoTabuleiro, numAlunos, numBugs);
		
		arrayRobos = new ArrayList<RobosAbstract>();
		
		arrayRobos.add(new RoboAndador("Robo Andador", plano, 0, 255, 0));
		//arrayRobos.add(new RoboTorre("Robo Torre", plano, 255, 0, 255));
		//arrayRobos.add(new RoboBispo("Robo Bispo", plano, 225, 0, 0));
		arrayRobos.add(new RoboCavalo("Robo Cavalo", plano, 155, 0, 255));
		arrayRobos.add(new RoboRei("Robo Rei", plano, 200, 70, 140));
		
		this.instanciarJanelaDeJogo();
	}
	
	public void verificarRodada() { 
		
		for (RobosAbstract robo : arrayRobos) {
			robo.finalizarMovimentacao();
			
		}
		
		plano.atualizarQtdBugEAlunos();
		
	}
	
	public void iniciarProximaRodada() { 
		
		plano.novaRodada();
		
		if(plano.verificaFim()) {
			
			this.gravaDados();
			intGraf.mostrarMsgFimDeJogo();
			intGraf.dispose();
			this.instanciarJanelaDeRelatorio();
			
		} else {
			
			intGraf.dispose();
			this.instanciarJanelaDeJogo();
			
		}
		
	}
	
	private void instanciarJanelaDeJogo() {
		intGraf = new Janela(this, plano, arrayRobos);
	}
	
	public void instanciarJanelaDeRelatorio() {
		new JanelaRelatorio(lerDados.lerLinhas(), intGraf);
	}
	
	private void gravaDados() {
		
		String dadosPartida = 
				
				plano.getNomeJogador()+";"+
				plano.getQtdRodadas()+";"+
				plano.verificaFim()+";"+
				plano.celulasVazias()+";"+
				plano.alunosResgatados()+";"+
				plano.bugsOcorridos()+";"+
				this.verificaPontuacaoFinal()+";"+
				this.arrayRobos.get(0).getPontuacao()+";"+
				this.arrayRobos.get(1).getPontuacao()+";"+
				this.arrayRobos.get(2).getPontuacao();
		
		escreverDados.gravarConcatString(dadosPartida);
		
	}
	
	public void finalizarJogo() { 
		
		this.gravaDados();
		System.exit(0);
		
	}
	
	private int verificaPontuacaoFinal() {

		int numPontos = 0;
		for (RobosAbstract robo : arrayRobos) {
			
			numPontos += robo.getPontuacao();
		}
		return numPontos;
	}
	
	
}