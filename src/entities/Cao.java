package entities;

public class Cao extends Animal {
	
	public Cao(String nome) {
		super(nome);
	}

	@Override
	public void fala() {
		System.out.println("Au au");
	}
}
