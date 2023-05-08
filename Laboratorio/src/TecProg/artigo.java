package TecProg;

public class artigo extends publicacoes{

	public artigo(String titulo, int anopublicacao, String autor, int quantidade) {
		super(titulo, anopublicacao, autor, quantidade);
		
		this.tipo = "artigo";
	}

}
