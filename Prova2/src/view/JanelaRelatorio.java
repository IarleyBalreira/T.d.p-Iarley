package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JanelaRelatorio extends JFrame{
	
	private DefaultTableModel modeloJTable;
	private JTable tabela;
	
	public JanelaRelatorio(String[] strDeDados, Component parentComponent) {
		
		this.setSize(1100,550);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(parentComponent);
		Font fontePadrao = new Font("SansSerif", Font.BOLD, 14);
		
		modeloJTable = new DefaultTableModel();
		
	 	modeloJTable.addColumn("Jogador");
	 	modeloJTable.addColumn("Num Rodadas");
	 	modeloJTable.addColumn("Concluiu o jogo");
	 	modeloJTable.addColumn("Celulas Vazias");
	 	modeloJTable.addColumn("Alunos resgatados");
	 	modeloJTable.addColumn("Bugs ocorridos");
	 	modeloJTable.addColumn("Pontuacao Geral");
	 	modeloJTable.addColumn("Andador");
	 	modeloJTable.addColumn("Rei");
	 	modeloJTable.addColumn("Cavalo");
	 	
	 	for (String linhaDeDados : strDeDados) {
	 		
			String dados[] = linhaDeDados.split(";");
			modeloJTable.addRow(dados);
		}
	 	
		tabela = new JTable(modeloJTable);
		
		tabela.setBackground(Color.LIGHT_GRAY);
		tabela.setFont(fontePadrao);
		
		this.add(new JScrollPane(tabela));
		
		this.setVisible(true);
	}
	
}