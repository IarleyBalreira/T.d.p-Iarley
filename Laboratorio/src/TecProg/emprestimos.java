package TecProg;

public class emprestimos {

	private clientes cliente;
	
	private publicacoes publicacao;
	
	public emprestimos(clientes cliente, publicacoes publicacao) {
		this.cliente = cliente;
		this.publicacao = publicacao;
	}
	
	private int duracaoEmprestimo() {
		return cliente.verificarDias();
	}
	
	public String dadosEmprestimo() {
		String dados = this.cliente.cargo + ": " + this.cliente.nome + " - "+ publicacao.tipo +
				": " + this.publicacao.titulo + " - Tempo de emprestimo: " + this.duracaoEmprestimo();
		return dados;
	}
}
