package relaciones;

import personajes.Personaje;

public abstract class Relacion {
	private Personaje productor;
	private Personaje afectado;
	
	
	
	public Relacion(Personaje productor, Personaje afectado) {
		this.productor = productor;
		this.afectado = afectado;	
		
	}
	
	
	
	
}
