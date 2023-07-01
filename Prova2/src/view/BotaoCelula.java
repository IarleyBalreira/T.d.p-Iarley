package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import controller.Celulas;


public class BotaoCelula extends Painel { // gera tabuleiro
	
	private int tamanho;
	private Janela ig;
	private int coord[];
	
	public BotaoCelula(Janela ig, int tamanho, ArrayList<Celulas> listaCelulas) {
		super(ig);
		this.ig = ig;
		this.tamanho = tamanho;
		
		coord = new int[2];

		this.setLayout(new GridLayout(tamanho,tamanho));
		
		JButton botao;
		Color corBotao;
		int cont = 0;
		for(int y = 0; y < tamanho; y++) {
			
			for(int x = 0; x < tamanho; x++) {
				
				cont = x + y; //contador que define a cor das celulas
				
				botao = criaBotao("[" + x + ", " + y + "]");
				
				corBotao = listaCelulas.get(( (y*tamanho) + x)).imprimirCor();
				if(corBotao == null) {
					if(cont % 2 == 0) 
						corBotao = Color.WHITE;
					 else 
						corBotao = Color.blue;  //new Color(140, 100, 140) cor diferenciada
				}
				botao.setBackground(corBotao);
				if(listaCelulas.get(((y*tamanho) + x)).temRobo()) {
					botao.setEnabled(false);
				}
				
				botao.addActionListener(new botaoCelula(x,y));
				this.add(botao);
			}
		}
		
	}
	
	private class botaoCelula implements ActionListener {
		
		private int coord[];
		public botaoCelula(int x, int y) {
			coord = new int[2];
			coord[0] = x;
			coord[1] = y;
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			JButton b = (JButton) e.getSource();
			b.setBackground(Color.gray);
			b.setEnabled(false);
			ig.retornarCoordAoRobo(coord);
		}
	}
}