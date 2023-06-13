package InterfaceGrafica;

import java.awt.Color;

import javax.swing.JPanel;

public class PainelGeral extends JPanel {

	private JanelaPrincipal frame;
		
	public PainelGeral(JanelaPrincipal frame) {
	
		this.frame = frame;
		
		Botao cadastrar = new Botao("Cadastrar");
		cadastrar.addActionListener(new MostrarCadastro(frame));
		
		Botao listar = new Botao("Listar");
		listar.addActionListener(new MostrarListar(frame));
		
		Botao atualizar = new Botao("Atualizar");
		atualizar.addActionListener(new MostrarAtualizar(frame));
		
		Botao deletar = new Botao("Deletar");
		deletar.addActionListener(new MostrarDeletar(frame));
		
		this.add(cadastrar);
		this.add(listar);
		this.add(atualizar);
		this.add(deletar);
		
	}
	
}
