package CorrecaoExcecoes;

class ContaCorrente {
	private float limite;
	private float saldo;
	private float valorLimite;

	public ContaCorrente(float limite, float valorLimite) {
		this.limite = limite;
		this.saldo = 0;
		this.valorLimite = valorLimite;
	}

	public void sacar(float valor) throws IllegalArgumentException {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor saque negativo.");
		}
		if (valor > saldo + limite) {
			throw new IllegalArgumentException("Saldo insuficiente.");
		}
		saldo -= valor;
		System.out.println("Saldo atualizado para" + saldo);
	}

	public void depositar(float valor) throws IllegalArgumentException {
		if (valor <= 0) {
			throw new IllegalArgumentException("Deposito negativo");
		}
		saldo += valor;
		System.out.println("Saldo atualizado para: " + saldo);
	}

	public void setValorLimite(float valor) throws IllegalArgumentException {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor negativo");
		}
		this.valorLimite = valor;
		System.out.println("Limite da conta atualizado para: " + valor);
	}

}

public class Questao_2 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente(1000.0f, 2000.0f);

        try {
            // Tentando sacar um valor maior que o saldo disponível
            conta.sacar(3000.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        try {
            // Tentando sacar um valor negativo
            conta.sacar(-100.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        try {
            // Depositando um valor negativo
            conta.depositar(-500.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }

        try {
            // Tentando setar um valor de limite negativo
            conta.setValorLimite(-1500.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o limite: " + e.getMessage());
        }
	}

}
