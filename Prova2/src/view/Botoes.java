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
import controller.RobosAbstract;

public class Botoes extends Painel{
	
	private Janela ig;
	private ArrayList<RobosAbstract> arrayDeRobos;
	private JPanel painelBotoesDosRobos;
	private JPanel painelBotoesDeControle;
	private JPanel painelDeRelatorio;
	private JButton botaoProxRodada;
	private ArrayList<JButton> botoesDeRobos;
	private Color corPadrao;
	
	public Botoes(Janela ig, Plano plano, ArrayList<RobosAbstract> arrayDeRobos) {
		super(ig);
		this.ig = ig;
		this.arrayDeRobos = arrayDeRobos;
		
		corPadrao = new Color(204, 204, 204); 
		JButton botao;
		
		this.setBackground(corPadrao);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setPreferredSize(new Dimension(300, 500));
		botoesDeRobos = new ArrayList<JButton>();
	
		
		
		painelBotoesDosRobos = criarpainel(corPadrao);
		painelBotoesDosRobos.setPreferredSize(new Dimension(300, 120));
		painelBotoesDosRobos.setLayout(new BoxLayout(painelBotoesDosRobos, BoxLayout.PAGE_AXIS));
		
		int contador = 0;
		for (RobosAbstract robo : arrayDeRobos) {
			
			botao = criarBotaoDoRobo(
					painelBotoesDosRobos, robo.getNome(), robo.getCorNoPlano(), new botaoDosRobos(contador));
			
			painelBotoesDosRobos.add(botao);
			botoesDeRobos.add(botao);
			contador++;
		}
		
		painelDeRelatorio = new PainelLateral(ig, arrayDeRobos, plano, corPadrao);
		
		painelBotoesDeControle = criarpainel(corPadrao);
		painelBotoesDeControle.setPreferredSize(new Dimension(200, 200));
		painelBotoesDeControle.setLayout(new GridLayout(3,1));
		
		botao = criarBotao(new Color(80, 200 , 105), "Verificar");
		botao.addActionListener(new botaoVerificar());
		painelBotoesDeControle.add(botao);
		
		botaoProxRodada = criarBotao(new Color(80, 200, 100), "Proxima Rodada");
		botaoProxRodada.addActionListener(new botaoRodada());
		botaoProxRodada.setEnabled(false);
		painelBotoesDeControle.add(botaoProxRodada);
		
		botao = criarBotao(new Color(80, 200, 100), "Sair Do Jogo");
		botao.addActionListener(new botaoSairDoJogo());
		painelBotoesDeControle.add(botao);
		
		this.add(painelBotoesDosRobos);
		this.add(painelDeRelatorio);
		this.add(painelBotoesDeControle);
		
	}
	
	private JButton criarBotaoDoRobo(JPanel jpanel, String nomeBotao, Color cor, ActionListener classeActListener ) {
		JButton botao = criarBotao(cor, nomeBotao);
		botao.addActionListener(classeActListener);
		botao.setFont(ig.getFontePadrao(14, Font.BOLD));
		botao.setForeground(Color.WHITE);
		botao.setPreferredSize(new Dimension(150,45));
		botao.setAlignmentX(CENTER_ALIGNMENT);
		return botao;
	}
	
	private RobosAbstract selecionarRobo(int indexArrayDeRobos) {
		RobosAbstract roboTemp = null;
		try {
			
			roboTemp = (RobosAbstract) arrayDeRobos.get(indexArrayDeRobos);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ERRO!");
		}
		return roboTemp;
	}
	
	
	private class botaoVerificar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			int botoesRoboLigados=0;
			for (JButton botao : botoesDeRobos) 
				if(!botao.isEnabled()) 
					botoesRoboLigados++;
			
			if(botoesRoboLigados == botoesDeRobos.size()) {
				
				((JButton) e.getSource()).setEnabled(false);
				botaoProxRodada.setEnabled(true);
				ig.verificar();
				((PainelLateral) painelDeRelatorio).atualizarJLabelsDeRelatorio();
			} else {
				ig.painelMessageDialog(((JButton) e.getSource()), "Posicione todos os robos");
			}
			
		}
	}
	
	private class botaoRodada implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			ig.proximaRodada();
			
		}
	}
	
	private class botaoSairDoJogo implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			ig.sairDoJogo();
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
				ig.setRoboTemp(selecionarRobo(numeroRobo));
				ig.setVisibilidadeBotoesCoord(true);
		}
	}
} 