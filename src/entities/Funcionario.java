package entities;

public class Funcionario {
	private String nome;
	private Integer horas;
	private Double valor_hora;

	// CONSTRUTORES
	public Funcionario() {
	}

	public Funcionario(String nome, Integer horas, Double valor_hora) {
		this.nome = nome;
		this.horas = horas;
		this.valor_hora = valor_hora;
	}

	// GETTERS SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(Double valor_hora) {
		this.valor_hora = valor_hora;
	}

	// METÓDOS
	public Double pagamento() {
		return horas * valor_hora;
	}

}
