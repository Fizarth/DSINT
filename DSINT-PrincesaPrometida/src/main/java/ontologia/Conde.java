package ontologia;

public class Conde extends Personaje{

	//TODO añadir amigo de
	//TODO alñadir conoce_a
	//TODO añadir enemigo de
	
	private Motivacion motivacion;
	private TituloNobiliario titulo;
	private Profesion profesion;
	
	public Conde(Lugar ubicacion) {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Tyrone Rugen", Origen.FLORIN, true, Sexo.HOMBRE,
				TipoImportancia.SECUNDARIO, ubicacion);
		this.motivacion = Motivacion.SERVIR_PRINCIPE;
		this.titulo = TituloNobiliario.CONDE;
		//TODO hay qe ver como cambia para estudiar dolor. en que momento y eso. o si ponerlo ocmo lista para que 
			//pueda tener varias.
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}

	public TituloNobiliario getTitulo() {
		return titulo;
	}

	public void setTitulo(TituloNobiliario titulo) {
		this.titulo = titulo;
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}
	
	
	
	
	

}
