package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controller.Plano;

public class PainelInicial extends Painel{
	
	private Janela ig;
	private Plano plano;
	private JTextField txtnome;
	private JButton botaoJogar;
	private JButton botaoRelatorioDoJogo;
	
	public PainelInicial(Janela ig, Plano plano) {
		super(ig);
		this.ig = ig;
		this.plano = plano;
		
		this.setPreferredSize(new Dimension(800, 60));
		this.setLayout(new GridLayout(1,2));
		
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		JPanel nomeJogador = criarpainel(new Color(120, 230, 245));
		
		txtnome = criarJTextField(new Dimension(180, 40));
		txtnome.setBackground(new Color(120, 230, 245));
		txtnome.setBorder(BorderFactory.createTitledBorder(loweredbevel,"Nome"));
		
		nomeJogador.add(txtnome);
		
		botaoJogar = criaBotao(new Color(110, 155, 235), "Jogar", new Dimension(80, 30));
		botaoJogar.addActionListener(new botaoJogar());
		nomeJogador.add(botaoJogar);
		
		JPanel painelBotaoRelatorio = criarpainel(new Color(120, 230, 245));
		
		botaoRelatorioDoJogo = criaBotao(new Color(110, 155, 235), "Historico Geral", new Dimension(180, 40));
		botaoRelatorioDoJogo.addActionListener(new botaoRelatorioDoJogo());
		painelBotaoRelatorio.add(botaoRelatorioDoJogo);
		
		this.add(nomeJogador);
		this.add(painelBotaoRelatorio);
		
		if(plano.getNomeJogador() != null) {
			
			txtnome.setText(plano.getNomeJogador());
			txtnome.setEnabled(false);
			botaoJogar.setEnabled(false);
		}
		
	}
	
	private JTextField criarJTextField(Dimension dimension) {
		JTextField jtf = new JTextField();
		jtf.setDisabledTextColor(Color.BLACK);		
		jtf.setPreferredSize(dimension);
		return jtf;
	}
	
	private class botaoJogar implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			if(txtnome.getText().isEmpty()) {
				
				ig.painelMessageDialog(txtnome, "Esqueceu do nome de jogador!");
			} else {
				
				plano.setNomeJogador(txtnome.getText());
				txtnome.setEnabled(false);
				botaoJogar.setEnabled(false);
				ig.setVisibilidadeBotoesComando(true);
			}
		}
		
	}
	
	private class botaoRelatorioDoJogo implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ig.relatorioDoJogo();
		}
		
	}
}