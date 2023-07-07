package entities;

public class BusinessAccount extends Account {
	private Double limite_emprestimo;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double limite_emprestimo) {
		super(number, holder, balance);
		this.limite_emprestimo = limite_emprestimo;
	}

	public Double getLoanLimit() {
		return limite_emprestimo;
	}

	public void setLoanLimit(Double limite_emprestimo) {
		this.limite_emprestimo = limite_emprestimo;
	}

	public void loan(Double amount) {
		if (amount <= limite_emprestimo) {
			// deposit(amount);
			balance += amount - 10.0;
		}
	}
	
	@Override 
	public final void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
