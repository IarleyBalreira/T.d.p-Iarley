package TecProg;

public class livros extends publicacoes {

	public livros(String titulo, int anopublicacao, String autor, int quantidade) {
		super(titulo, anopublicacao, autor, quantidade);
		
		this.tipo = "livro";
	}

	
}
