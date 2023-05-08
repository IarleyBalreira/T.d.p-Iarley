package TecProg;

public abstract class publicacoes {

	protected String titulo;
	
	protected int anopublicacao;
	
	protected String autor;
	
	protected int quantidade;
	
	protected String tipo;
	
	public int reservado;
	
	public boolean disponivel;

	public publicacoes(String titulo, int anopublicacao, String autor, int quantidade) {
		super();
		this.titulo = titulo;
		this.anopublicacao = anopublicacao;
		this.autor = autor;
		this.quantidade = quantidade;
		
	}
}
