package relaciones;

import personajes.*;

public abstract class Relacion {
	
	private Personaje afectado;
	private final String nombre;
	
	
	public Relacion(String nombre, Personaje afectado) {
		this.nombre = nombre;
		this.afectado = afectado;	
	}


	@Override
	public String toString() {
		return  nombre + " " + afectado.getNombre();
	}
		
}
