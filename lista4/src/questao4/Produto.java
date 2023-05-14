package questao4;

public class Produto {

	public String nome;
	public int preco;
	public int quantidade;
	public boolean foiComprado;
	
	public Produto(String nomeString, int preco, int quantidade) {
		this.nome = nomeString;
		this.preco = preco;
		this.quantidade = quantidade;
		this.foiComprado = false;
	}
	
	public void comprarProduto() {
		System.out.println("O nome do produto é " + this.nome);
		float total = this.preco*this.quantidade;
		if (total>100 && total<200) {
			total = total*9/10;
		}
		else if (total>=200 && total<500) {
			total = total*8/10;
		}
		else if (total>=500) {
			total = total*75/100;
		}
		
		System.out.println("O valor pago será " + total);
		this.foiComprado = true;
	}
	
	
}
