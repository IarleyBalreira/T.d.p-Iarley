package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JButton;

public class JanelaPrincipal extends JFrame{
	
	public PainelCadastrar painelCadastrar = new PainelCadastrar();
	public PainelListar painelListar = new PainelListar();
	public PainelAtualizar painelAtualizar = new PainelAtualizar() ;
	public PainelDeletar painelDeletar = new PainelDeletar();
	
	public JanelaPrincipal() {
		
		
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		PainelGeral painelBotao = new PainelGeral(this);
		painelBotao.setBackground(Color.DARK_GRAY);
		
		JPanel painelGenerico = new JPanel();
		painelGenerico.setBackground(Color.LIGHT_GRAY);
		
		painelGenerico.add(painelCadastrar);
		painelGenerico.add(painelListar);
		painelGenerico.add(painelAtualizar);
		painelGenerico.add(painelDeletar);
		add(painelBotao, BorderLayout.NORTH);
		add(painelGenerico, BorderLayout.CENTER);
		
		
	
		/*
		painelCadastrar.setVisible(false);
		JPanel painelGenerico = new JPanel();
		painelGenerico.add(painelCadastrar);
		painelGenerico.add(painelListar);
		painelGenerico.add(painelAtualizar);
		painelGenerico.add(painelDeletar);
		*/
		
		setVisible(true);	
	}
	
	
	
}
