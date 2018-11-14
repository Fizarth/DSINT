package animales;

import lugares.*;

public abstract class Animal {

	private Lugar ubicacionActual;

	public Animal() {
		this.ubicacionActual = null;
	}

	public Lugar getUbicacionActual() {
		return ubicacionActual;
	}

	public void setUbicacionActual(Lugar ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}

}
