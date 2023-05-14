package questao3;

public class Fatura {

	public int numeroItem;
	public String descricao;
	private int quantidade;
	private float precoUnitario;
	
	public Fatura(int numeroItem, String descricao, int quantidade, float precoUnitario) {
		
		this.numeroItem = numeroItem;
		this.descricao = descricao;
		this.setPrecoUnitario(precoUnitario);
		this.setQuantidade(quantidade);
		
	}
	
	public int getNumeroItem() {
		return numeroItem;
	}
	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}
	public String getDescricaoString() {
		return descricao;
	}
	public void setDescricaoString(String descricaoString) {
		this.descricao = descricaoString;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if (quantidade<0) {
			this.quantidade = 0;
		}
		else {
			this.quantidade = quantidade;
		}
	}
	public float getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(float precoUnitario) {
		if (precoUnitario<0) {
			this.precoUnitario = 0;
		}
		else {
			this.precoUnitario = precoUnitario;
		}
	}
	
	public Double getValorFatura() {
		
		float preco = this.precoUnitario;
		float quantidade = this.quantidade;
		return (double) preco * quantidade;
		
	}
}
