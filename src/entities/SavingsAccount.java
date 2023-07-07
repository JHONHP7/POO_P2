package entities;

public final class SavingsAccount extends Account {
	private Double taxaDeJuros;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double taxaDeJuros) {
		super(number, holder, balance);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getInterestRate() {
		return taxaDeJuros;
	}

	public void setInterestRate(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

	public void updateBalance() {
		balance += balance * taxaDeJuros;
	}
	
	@Override 
	public final void withdraw(double amount) {
		balance -= amount;
	}
	
	
}
