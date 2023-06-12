package InterfaceGrafica;

import java.awt.Color;

public class PainelGeral extends Painel {

	private Janela geral;
	public PainelGeral(Janela frame) {
		this.geral = frame;
	}
		
	public PainelGeral() {
	
		Botao cadastrar = new Botao("Cadastrar");
		cadastrar.addActionListener(new MostrarCadastro(geral));
		
		Botao listar = new Botao("Listar");
		
		
		Botao atualizar = new Botao("Atualizar");
		
		
		Botao deletar = new Botao("Deletar");
		
		
		this.add(cadastrar);
		this.add(listar);
		this.add(atualizar);
		this.add(deletar);
		
	}
	
}
