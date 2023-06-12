package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarAtualizar implements ActionListener {

	private Janela frame;
	public MostrarAtualizar(Janela frame) {
		
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		frame.painelCadastrar.setVisible(false);
		frame.painelAtualizar.setVisible(true);
		frame.painelListar.setVisible(false);
		frame.painelDeletar.setVisible(false);
	}

}
