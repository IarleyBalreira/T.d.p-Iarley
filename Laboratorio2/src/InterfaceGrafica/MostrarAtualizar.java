package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarAtualizar implements ActionListener {

	private JanelaPrincipal frame;
	public MostrarAtualizar(JanelaPrincipal frame) {
		
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		frame.painelCadastrar.setVisible(false);
		frame.painelAtualizar.setVisible(true);
		frame.painelListar.setVisible(false);
		frame.painelDeletar.setVisible(false);
	}

}
