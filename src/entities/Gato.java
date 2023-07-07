package entities;

public class Gato extends Animal {
	
	public Gato(String nome) {
		super(nome);
	}

	@Override
	public void fala() {
		System.out.println("Miau");
	}
}
