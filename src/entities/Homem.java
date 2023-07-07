package entities;

public class Homem extends Animal {
	
	public Homem(String nome) {
		super(nome);
	}

	@Override
	public void fala() {
		System.out.println("Oi");
	}
}
