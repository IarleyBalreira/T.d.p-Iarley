package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarCadastro implements ActionListener{

	
	private JanelaPrincipal frame;
	
	public MostrarCadastro(JanelaPrincipal frame) {
		this.frame = frame;	
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		frame.painelCadastrar.setVisible(true);
		frame.painelAtualizar.setVisible(false);
		frame.painelListar.setVisible(false);
		frame.painelDeletar.setVisible(false);
	
	}
	

}
