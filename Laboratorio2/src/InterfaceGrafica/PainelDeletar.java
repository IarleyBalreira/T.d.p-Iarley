package InterfaceGrafica;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PainelDeletar extends JPanel {

	public PainelDeletar() {
		
		this.setPreferredSize(new Dimension(500,500));
		this.setBackground(Color.LIGHT_GRAY);
		
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		
		JTextField txtmatricula = new JTextField() ; 
		txtmatricula.setBounds(150, 40, 200, 50);
		txtmatricula.setBackground(Color.LIGHT_GRAY);
		txtmatricula.setBorder(BorderFactory.createTitledBorder(loweredbevel, "Matricula"));
		
		Botao b= new Botao("Deletar");
		b.setBounds(150, 300, 200, 50);
		
		this.setLayout(null);
		
		this.add(txtmatricula);
		this.add(b);
		
		setVisible(false);
	}
}
