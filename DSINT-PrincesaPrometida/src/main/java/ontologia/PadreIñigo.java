package ontologia;

public class PadreI�igo extends Personaje{
	
	//TODO familiar de 
	
	private Profesion profesion;

	public PadreI�igo( Lugar ubicacion) {
		super(EstadoCivil.INDEFINIDO, EstadoSalud.MUERTO, "Domingo Montoya", Origen.ESPA�A, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO, ubicacion);
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}
	
	
}
