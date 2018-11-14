package animales;

import lugares.*;

public abstract class Animal {

	private Lugar ubicacionActual;
	private String nombre;

	public Animal(String tipo) {
		this.ubicacionActual = null;
		this.nombre = tipo;
	}

	public Lugar getUbicacionActual() {
		return ubicacionActual;
	}

	public void setUbicacionActual(Lugar ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}

	public String getNombre() {
		return nombre;
	}

}
