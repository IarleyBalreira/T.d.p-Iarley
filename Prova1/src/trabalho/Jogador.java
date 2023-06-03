package trabalho;

public class Jogador {
	
	private String nome;
	public boolean jogando;
	
	public Jogador(String nome) {
		super();
		this.nome = nome;
		this.jogando = true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
