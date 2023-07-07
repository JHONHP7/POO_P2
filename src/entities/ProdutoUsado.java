package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produtos{
	private LocalDate  data;
	
	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, Double preço, LocalDate data) {
		super(nome, preço);
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String priceTag() {
		return getNome() 
				+ " (usado) $ " 
				+ String.format("%.2f", getPreço())
				+ " (Data de fabricação: "
				+ data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
	
	
}
