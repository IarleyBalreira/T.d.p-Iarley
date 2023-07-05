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
	private Janela janela;
	private int coord[];
	
	public BotaoCelula(Janela janela, int tamanho, ArrayList<Celulas> listaCelulas) {
		super(janela);
		this.janela = janela;
		this.tamanho = tamanho;
		
		coord = new int[2];

		this.setLayout(new GridLayout(tamanho,tamanho));
		
		JButton botao;
		Color corBotao;
		int cont = 0;
		
		
		for(int y = 0; y < tamanho; y++) {
			
			for(int x = 0; x < tamanho; x++) {
				
				cont = x + y; //contador para definir a cor das celulas
				
				botao = criaBotao("( " + x + ", " + y + " )");// coordenadas das celulas
				
				corBotao = listaCelulas.get(( (y*tamanho) + x)).imprimirCor();
		
				if(corBotao == null) {
					if(cont % 2 == 0) 
						corBotao = Color.WHITE;
					 else 
						corBotao = Color.blue;    
				}
				
				botao.setBackground(corBotao);
				if(listaCelulas.get(( (y*tamanho ) + x)).temRobo()) {
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
			janela.retornarCoordAoRobo(coord);
		}
		
	}
	
}