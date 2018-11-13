package lugares;

public abstract class Lugar {
	private final String nombre;
	
	public Lugar(){
		nombre = getClass().getSimpleName();
	}
	
	
}
