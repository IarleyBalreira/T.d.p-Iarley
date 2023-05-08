package TecProg;

public class revistas extends publicacoes{
	
	
	public revistas(String titulo, int anopublicacao, String autor, int quantidade) {
		super(titulo, anopublicacao, autor, quantidade);
		
		this.tipo = "revista";
	}

}
