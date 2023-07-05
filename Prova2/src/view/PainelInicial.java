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
	
	private Janela janela;
	private Plano plano;
	private JTextField txtnome;
	private JButton botaoJogar;
	private JButton botaoRelatorio;
	
	public PainelInicial(Janela janela, Plano plano) {
		super(janela);
		this.janela = janela;
		this.plano = plano;
		
		this.setPreferredSize(new Dimension(janela.getWidth(), 75));
		this.setLayout(new GridLayout(1,1));
//		this.setLayout(null);
		
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		JPanel painel = criarpainel(Color.LIGHT_GRAY);
		
//		txtnome.setBounds(50, 10, 300, 50);
		txtnome = criarTextField(new Dimension(200, 40));
		txtnome.setBackground(Color.LIGHT_GRAY);
		txtnome.setBorder(BorderFactory.createTitledBorder(loweredbevel,"Nome"));
		
		botaoJogar = criaBotao(new Color(110, 155, 235), "Jogar", new Dimension(80, 30));
		botaoJogar.addActionListener(new botaoJogar());
		
		botaoRelatorio = criaBotao(new Color(110, 155, 235), "Historico geral", new Dimension(180, 40));
		botaoRelatorio.addActionListener(new botaoRelatorio());
		
		painel.add(txtnome);
		painel.add(botaoJogar);
		painel.add(botaoRelatorio);
		this.add(painel);
		
		if(plano.getNomeJogador() != null) {
			
			txtnome.setText(plano.getNomeJogador());
			txtnome.setEnabled(false);
			botaoJogar.setEnabled(false);
		}
		
	}
	
	private JTextField criarTextField(Dimension dimension) {
		JTextField jtf = new JTextField();
		jtf.setDisabledTextColor(Color.BLACK);		
		jtf.setPreferredSize(dimension);
		return jtf;
	}
	
	private class botaoJogar implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			if(txtnome.getText().isEmpty()) {
				
				janela.painelMessageDialog(txtnome, "Esqueceu do nome de jogador!");
				 // mensagem caso nao tenha colocado nome
			} else {
				
				plano.setNomeJogador(txtnome.getText());
				txtnome.setEnabled(false);
				botaoJogar.setEnabled(false);
				janela.setVisibilidadeBotoesComando(true);
			}
		}
		
	}
	
	private class botaoRelatorio implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janela.relatorioDoJogo();
		}
		
	}
}