package ontologia;

public class PadreIñigo extends Personaje{
	
	//TODO familiar de 
	
	private Profesion profesion;

	public PadreIñigo( Lugar ubicacion) {
		super(EstadoCivil.INDEFINIDO, EstadoSalud.MUERTO, "Domingo Montoya", Origen.ESPAÑA, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO, ubicacion);
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}
	
	
}
