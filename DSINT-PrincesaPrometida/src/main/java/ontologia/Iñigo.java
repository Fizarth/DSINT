package ontologia;

public class Iñigo extends Personaje{

	//TODO amigo de 
	//TODO enemigo de 
	//TODO familia de 
	//TODO trabaja de
	
	private Motivacion motivacion;
	
	public Iñigo(Lugar ubicacion) {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Iñigo Montoya" , Origen.ESPAÑA, true, Sexo.HOMBRE,
				TipoImportancia.PROTAGONISTA, ubicacion);
		this.motivacion = Motivacion.VENGAR_PADRE;
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}

	
	
}
