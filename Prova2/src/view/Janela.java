package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.*;

import controller.*;

public class Janela extends JFrame {

	private Gerador gerador;
	private int tamanho;
	private Robos roboTemp;
	private JPanel painelInicial;
	private JPanel painelBotaoCelula;
	private JPanel painelBotoes;
	
	public Janela(Gerador gerador, Plano plano, ArrayList<Robos> robos) {
		
		this.gerador = gerador;
		this.tamanho = plano.getTamanho();
		
		this.setSize(900, 650);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setLayout(new BorderLayout());
		
		
		painelInicial = new PainelInicial(this, plano);
		this.add(painelInicial, BorderLayout.NORTH);
		
		painelBotaoCelula = new BotaoCelula(this, tamanho, plano.getListaCelulas());
		this.add(painelBotaoCelula, BorderLayout.CENTER);
		this.setVerBotao(false);
	
		painelBotoes = new BotoesInGame(this, plano, robos);
		this.add(painelBotoes, BorderLayout.EAST);
		
		if(plano.getNomeJogador() != null)
			this.setVisibilidadeBotoesComando(true);
		else
			this.setVisibilidadeBotoesComando(false);
		
		this.setVisible(true);
	} 
	
	
	protected void relatorioDoJogo() { 
		gerador.instanciarJanelaDeRelatorio();
	}
	
	protected void sairDoJogo() { 
		gerador.finalizarJogo();
	}
	
	protected void verificar() { 
		gerador.verificarRodada();
	}
	
	protected void proximaRodada() { 
		gerador.iniciarProximaRodada();
	}
	
	
	protected void retornarCoordAoRobo(int coord[]) {
		
		if(roboTemp != null && coord[0]!=-1 && coord[1]!=-1) {
			
			roboTemp.movimentar(coord);
			roboTemp=null;
			coord[0]=-1;
			coord[1]=-1;
			this.setVerBotao(false);
		}
	}	
	
	protected void painelMessageDialog(Component parentComponent, String msg) {
		
		JOptionPane.showMessageDialog(parentComponent, msg, "!!!", 1);
	}
	
	public void mostrarMsgFimDeJogo() {
		this.painelMessageDialog(this, "Parabens! \nTodos os alunos foram resgatados.");
	}
	
	
	protected void setVisibilidadeBotoesComando(boolean estado) {
		painelBotoes.setVisible(estado);
	}
	
	protected void setVerBotao(boolean estado) {
		painelBotaoCelula.setVisible(estado);
	}
	
	
	protected Font getFontePadrao(int tamanhoFonte, int tipoDeLetra) {	
		return new Font("SansSerif", tipoDeLetra, tamanhoFonte);
	}
	
	
	protected void setRoboTemp(Robos roboTemp) {
		this.roboTemp = roboTemp;
	}
	
}