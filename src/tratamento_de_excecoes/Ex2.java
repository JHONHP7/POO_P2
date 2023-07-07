package tratamento_de_excecoes;

class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    public ContaCorrente(float valorLimite) {
        this.limite = valorLimite;
        this.saldo = 0.0f;
        this.valorLimite = valorLimite;
    }

    public void sacar(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de saque inválido: valor negativo");
        }

        if (valor > saldo + limite) {
            throw new IllegalArgumentException("Valor de saque inválido: valor maior que o possível");
        }

        saldo -= valor;
    }

    public void depositar(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de depósito inválido: valor negativo");
        }

        saldo += valor;
    }

    public void setValorLimite(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de limite inválido: valor negativo");
        }

        limite = valor;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000.0f);

        try {
            conta.depositar(500.0f);
            conta.sacar(200.0f);
            conta.sacar(1000.0f); // Deve lançar uma exceção
            conta.setValorLimite(1500.0f);
            conta.sacar(1200.0f); // Deve lançar uma exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
