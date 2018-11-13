package ontologia;

public class I�igo extends Personaje{

	//TODO amigo de 
	//TODO enemigo de 
	//TODO familia de 
	//TODO trabaja de
	
	private Motivacion motivacion;
	
	public I�igo(Lugar ubicacion) {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "I�igo Montoya" , Origen.ESPA�A, true, Sexo.HOMBRE,
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
