package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarCadastro implements ActionListener{

	
	private Janela frame = new Janela();
	
	public MostrarCadastro(Janela frame) {
		this.frame = frame;
		
		
	}
	public void actionPerformed(ActionEvent e) {
		
		frame.painelCadastrar.mostrar();
		frame.painelAtualizar.naoMostrar();
		frame.painelListar.naoMostrar();
		frame.painelDeletar.naoMostrar();
	
	}
	

}
