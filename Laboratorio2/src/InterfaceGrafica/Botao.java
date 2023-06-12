package InterfaceGrafica;

import java.awt.Color;

import javax.swing.JButton;

public class Botao extends JButton {
	
	public Botao(String nome) {
		this.setText(nome);
		this.setBackground(Color.white);
		setSize(100,40);
	}

}
