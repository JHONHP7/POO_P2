package entities;

import interfaces.Taxavel;

public class CarroImportado extends Carro implements Taxavel {
	@Override
	public double calculaTaxa() {
		return getVelocidadeInicial()+10;
	}
	
}
