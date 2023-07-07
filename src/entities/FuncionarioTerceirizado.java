package entities;

public class FuncionarioTerceirizado extends Funcionario {
	private Double despesa_adicional;

	public FuncionarioTerceirizado() {
	}

	public FuncionarioTerceirizado(String nome, Integer hora, Double valor_hora, Double despesa_adicional) {
		super(nome, hora, valor_hora);
		this.despesa_adicional = despesa_adicional;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + despesa_adicional * 1.1;
	}
}
