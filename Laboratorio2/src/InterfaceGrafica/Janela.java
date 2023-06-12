package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JButton;

public class Janela extends JFrame{
	
	public PainelCadastrar painelCadastrar = new PainelCadastrar();
	public PainelListar painelListar = new PainelListar();
	public PainelAtualizar painelAtualizar = new PainelAtualizar() ;
	public PainelDeletar painelDeletar = new PainelDeletar();
	
	public Janela() {
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		PainelGeral painel1 = new PainelGeral();
		painel1.setBackground(Color.DARK_GRAY);
		
		add(painel1, BorderLayout.NORTH);
		
		painelCadastrar.setVisible(false);
		JPanel painelGenerico = new JPanel();
		painelGenerico.add(painelCadastrar);
		painelGenerico.add(painelListar);
		painelGenerico.add(painelAtualizar);
		painelGenerico.add(painelDeletar);
		
		setVisible(true);	
	}
	
	
}
