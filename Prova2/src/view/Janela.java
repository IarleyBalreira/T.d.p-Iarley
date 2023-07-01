package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.*;

import controller.*;

public class Janela extends JFrame {

	private Gerador controlador;
	private int tamanho;
	private RobosAbstract roboTemp;
	private JPanel painelDeInicio;
	private JPanel painelBotoesDeCoord;
	private JPanel painelBotoesDeComando;
	
	public Janela(Gerador controlador, Plano plano, ArrayList<RobosAbstract> robos) {
		
		this.controlador = controlador;
		this.tamanho = plano.getTamanho();
		
		this.setSize(900, 650);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new BorderLayout());
		
		
		painelDeInicio = new PainelInicial(this, plano);
		this.add(painelDeInicio, BorderLayout.PAGE_START);
		
		painelBotoesDeCoord = new BotaoCelula(this, tamanho, plano.getArrayListCelulas());
		this.add(painelBotoesDeCoord, BorderLayout.WEST);
		this.setVisibilidadeBotoesCoord(false);
	
		painelBotoesDeComando = new Botoes(this, plano, robos);
		this.add(painelBotoesDeComando, BorderLayout.EAST);
		
		if(plano.getNomeJogador() != null)
			this.setVisibilidadeBotoesComando(true);
		else
			this.setVisibilidadeBotoesComando(false);
		
		this.setVisible(true);
	} 
	
	
	protected void relatorioDoJogo() { 
		controlador.instanciarJanelaDeRelatorio();
	}
	
	protected void sairDoJogo() { 
		controlador.finalizarJogo();
	}
	
	protected void verificar() { 
		controlador.verificarRodada();
	}
	
	protected void proximaRodada() { 
		controlador.iniciarProximaRodada();
	}
	
	
	protected void painelMessageDialog(Component parentComponent, String msg) {
		JOptionPane.showMessageDialog(parentComponent, msg, "Aviso do Jogo", 1);
	}
	
	public void mostrarMsgFimDeJogo() {
		this.painelMessageDialog(this, "Parabens! \nTodos os alunos foram resgatados.");
	}
	
	
	protected void retornarCoordAoRobo(int coord[]) {
		
		if(roboTemp != null && coord[0]!=-1 && coord[1]!=-1) {
			
			roboTemp.movimentar(coord);
			roboTemp=null;
			coord[0]=-1;
			coord[1]=-1;
			this.setVisibilidadeBotoesCoord(false);
		}
	}	
	
	
	protected void setVisibilidadeBotoesComando(boolean estado) {
		painelBotoesDeComando.setVisible(estado);
	}
	
	protected void setVisibilidadeBotoesCoord(boolean estado) {
		painelBotoesDeCoord.setVisible(estado);
	}
	
	
	protected Font getFontePadrao(int tamanhoFonte, int tipoDeLetra) {	
		return new Font("SansSerif", tipoDeLetra, tamanhoFonte);
	}
	
	
	protected void setRoboTemp(RobosAbstract roboTemp) {
		this.roboTemp = roboTemp;
	}
	
}