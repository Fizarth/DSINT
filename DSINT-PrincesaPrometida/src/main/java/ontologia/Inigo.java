package ontologia;

public class Inigo extends Personaje{

	//TODO amigo de 
	//TODO enemigo de 
	//TODO familia de 
	//TODO trabaja de
	
	private Motivacion motivacion;
	
	public Inigo(Lugar ubicacion) {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Inigo Montoya" , Origen.ESPANA, true, Sexo.HOMBRE,
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
