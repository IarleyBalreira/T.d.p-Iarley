package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PainelAtualizar extends JPanel  {

public PainelAtualizar() {
	
	this.setPreferredSize(new Dimension(500,500));
	this.setBackground(Color.LIGHT_GRAY);
	Border loweredbevel = BorderFactory.createLoweredBevelBorder();
	
	JTextField txtmatricula = new JTextField() ; 
	txtmatricula.setBounds(150, 50, 200, 50);
	txtmatricula.setBackground(Color.LIGHT_GRAY);
	txtmatricula.setBorder(BorderFactory.createTitledBorder(loweredbevel, "Matricula"));
	
	JTextField txtvertente = new JTextField() ;
	txtvertente.setBounds(150, 140, 200, 50);
	txtvertente.setBackground(Color.LIGHT_GRAY);
	txtvertente.setBorder(BorderFactory.createTitledBorder(loweredbevel, "Vertente"));
	
	Botao atualizacao = new Botao("Atualizar");
	atualizacao.setBounds(150, 300, 200, 50);
	atualizacao.addActionListener(null);
	
	this.setLayout(null);
	this.add(txtmatricula);
	this.add(txtvertente);
	this.add(atualizacao);
		
		setVisible(false);
	}

}
