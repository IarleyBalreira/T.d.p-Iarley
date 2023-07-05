package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Plano;
import controller.Robos;

public class BotoesInGame extends Painel{
	
	private Janela janela;
	private ArrayList<Robos> listaRobos;
	private JPanel painelBotoesRobos;
	private JPanel painelBotoesGerais;
	private JPanel painelRelatorio;
	private JButton botaoProxRodada;
	private ArrayList<JButton> botoesRobos;
	private Color corPadrao;
	
	public BotoesInGame(Janela janela, Plano plano, ArrayList<Robos> listaRobos) {
		super(janela);
		this.janela = janela;
		this.listaRobos = listaRobos;

		corPadrao = new Color(100,100,100); 
		JButton botao;
		
		this.setBackground(corPadrao);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setPreferredSize(new Dimension(300, 400));
		botoesRobos = new ArrayList<JButton>();
		
		painelBotoesRobos = criarpainel(corPadrao);
		painelBotoesRobos.setPreferredSize(new Dimension(300, 120));
		painelBotoesRobos.setLayout(new BoxLayout(painelBotoesRobos, BoxLayout.PAGE_AXIS));
		
		int cont = 0;
		for (Robos robo : listaRobos) {
			
			botao = criarBotaoRobo(painelBotoesRobos, robo.getNome(), robo.getCorRobo(), new botaoDosRobos(cont));
			
			painelBotoesRobos.add(botao);
			botoesRobos.add(botao);
			cont++;
		}
		
		painelRelatorio = new PainelLateral(janela, listaRobos, plano, corPadrao);
		
		painelBotoesGerais = criarpainel(corPadrao);
		
		painelBotoesGerais.setPreferredSize(new Dimension(150, 150));
		painelBotoesGerais.setLayout(new GridLayout(3,1));
		
		botao = criarBotao(new Color(80, 200 , 105), "Verificar");
		botao.addActionListener(new botaoVerificar());
		painelBotoesGerais.add(botao);
		
		botaoProxRodada = criarBotao(new Color(80, 200, 100), "Proxima rodada");
		botaoProxRodada.addActionListener(new botaoRodada());
		botaoProxRodada.setEnabled(false);
		painelBotoesGerais.add(botaoProxRodada);
		
		botao = criarBotao(new Color(80, 200, 100), "Sair do jogo");
		botao.addActionListener(new botaoSairDoJogo());
		painelBotoesGerais.add(botao);
		
		this.add(painelBotoesRobos);
		this.add(painelRelatorio);
		this.add(painelBotoesGerais);
		
	}
	
	private JButton criarBotaoRobo(JPanel jpanel, String nomeBotao, Color cor, ActionListener classeActListener ) {
		JButton botao = criarBotao(cor, nomeBotao);
		
		botao.addActionListener(classeActListener);
		botao.setPreferredSize(new Dimension(200,50));
		botao.setAlignmentX(CENTER_ALIGNMENT);
		return botao;
	}
	
	private Robos selecionarRobo(int indexArrayDeRobos) {
		Robos roboTemp = null;
		try {
			
			roboTemp = (Robos) listaRobos.get(indexArrayDeRobos);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ERRO!");
		}
		return roboTemp;
	}
	
	
	private class botaoVerificar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			int botoesRoboLigados = 0;
			for (JButton botao : botoesRobos) 
				if(!botao.isEnabled()) 
					botoesRoboLigados++;
			
			if(botoesRoboLigados == botoesRobos.size()) {
				
				((JButton) e.getSource()).setEnabled(false);
				botaoProxRodada.setEnabled(true);
				janela.verificar();
				((PainelLateral) painelRelatorio).atualizarInfoDoJogo();
			} else {
				janela.painelMessageDialog(((JButton) e.getSource()), "Posicione todos os robos");
			}
			
		}
	}
	
	private class botaoRodada implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			janela.proximaRodada();
			
		}
	}
	
	private class botaoSairDoJogo implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			janela.sairDoJogo();
		}
	}
	
	private class botaoDosRobos implements ActionListener {
		
		int numeroRobo;
		public botaoDosRobos(int numeroRobo) {
			
			this.numeroRobo = numeroRobo;
		}
		public void actionPerformed(ActionEvent e) {
			
			JButton b = (JButton) e.getSource();
				b.setBackground(b.getBackground().darker());
				b.setEnabled(false);
				janela.setRoboTemp(selecionarRobo(numeroRobo));
				janela.setVerBotao(true);
		}
	}
} 