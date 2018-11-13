package lugares;

public abstract class Lugar {
	// cambiar, no tiene sentido (?)
	private final String nombre;
	
	public Lugar(){
		nombre = getClass().getSimpleName();
	}
	
	
}
