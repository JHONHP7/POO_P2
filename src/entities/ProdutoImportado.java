package entities;

public class ProdutoImportado extends Produtos {
	private Double taxa_alfandega;

	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, Double preço, Double taxa_alfandega) {
		super(nome, preço);
		this.taxa_alfandega = taxa_alfandega;
	}

	public Double getTaxa_alfandega() {
		return taxa_alfandega;
	}

	public void setTaxa_alfandega(Double taxa_alfandega) {
		this.taxa_alfandega = taxa_alfandega;
	}
	
	public Double precoTotal() {
		return getPreço()+taxa_alfandega;
	}
	
	@Override
	public String priceTag() {
		return getNome() 
				+ " $ " 
				+ String.format("%.2f", precoTotal())
				+ " (Taxa: $ " 
				+ String.format("%.2f", taxa_alfandega)
				+ ")";
	}
}
