package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarListar implements ActionListener{

	private JanelaPrincipal frame;
	public MostrarListar(JanelaPrincipal frame) {
		
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		frame.painelCadastrar.setVisible(false);
		frame.painelAtualizar.setVisible(false);
		frame.painelListar.setVisible(true);
		frame.painelDeletar.setVisible(false);
	}
	
}
