package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarDeletar implements ActionListener{

	private Janela frame;
	public MostrarDeletar(Janela frame) {
		
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		frame.painelCadastrar.setVisible(false);
		frame.painelAtualizar.setVisible(false);
		frame.painelListar.setVisible(false);
		frame.painelDeletar.setVisible(true);
	}
}
