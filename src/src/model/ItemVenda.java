package src.model;

public class ItemVenda {

	private int quantidade;
	
	private Produto produto;
	
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public float getSubtotal() {
		return this.produto.getPreco()* this.quantidade;
	}
	
	
}
