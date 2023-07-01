package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Painel extends JPanel{
	
	private Janela ig;
	
	public Painel(Janela ig) {
		
		this.ig = ig;
	} 
	
	
	protected JPanel criarpainel() {
		return new JPanel();
	}
	protected JPanel criarpainel(Color c) {	
		JPanel p = new JPanel();
		p.setBackground(c);
		return p;
	}
// lembrar sobrecarga de metodos
	
	protected ImageIcon criarImageIcon(String diretorio, int tamanhoX, int tamanhoY) {
		Image novaImg = null;
		diretorio = "src\\img\\" + diretorio;
		try {
			Image imagem = new ImageIcon(diretorio).getImage();
			novaImg = imagem.getScaledInstance(tamanhoX, tamanhoY,  java.awt.Image.SCALE_SMOOTH);
		} catch (Exception e) {
			System.out.println("Erro na criacao do ImageIcon");
			e.printStackTrace();
		}
		return new ImageIcon(novaImg);
	}
	
	protected JLabel criarJLabel(String str, Color corForeground) {
		
		JLabel jl = new JLabel(str);
		jl.setForeground(corForeground);
		return jl;
	}
	
	protected JButton criarBotao(Color c, String nome) {
		JButton b = new JButton(nome);
		b.setName(nome);
		b.setBackground(c);
		return b;
	}
	
	protected JButton criaBotao(Color c, String nome, Icon img) {
		
		JButton b = new JButton(nome, img);
		b.setName(nome);
		b.setBackground(c);
		return b;
	}
	
	protected JButton criaBotao(String msg) {
		JButton b = new JButton(msg);
		b.setName(msg);
		return b;
	}
	
	protected JButton criaBotao(Color c, String nome, Dimension dimension) {
		JButton b = new JButton(nome);
		b.setName(nome);
		b.setPreferredSize(dimension);
		b.setBackground(c);
		return b;
	}
	
}