package entities;

public class Carro {
	private int velocidadeInicial;

	public Carro() {
	}
	public Carro(int velociadeInicial) {
		this.velocidadeInicial = velociadeInicial;
	}
	
	public int getVelocidadeInicial() {
		return velocidadeInicial;
	}
	public void setVelocidadeInicial(int velocidadeInicial) {
		this.velocidadeInicial = velocidadeInicial;
	}
	public double calculaTaxa() {
		// TODO Auto-generated method stub
		return 0;
	}
}
