package ontologia;

public class Buttercup extends Personaje{
	//TODO añadir Amigo de
	//TODO añadir odia_a
	//TODO añadir quiere_a
	//TODO como poner posteriormente que etsta prometida
	
	
	private Motivacion motivacion;
	private Profesion profesion;
	
	public Buttercup(EstadoCivil estadoCivil, EstadoSalud salud , Lugar ubicacion) {
		super(estadoCivil, salud, "Buttercup", Origen.FLORIN,true, Sexo.MUJER, TipoImportancia.PROTAGONISTA, ubicacion);
		//TODO no se si esto cambia a lo largo de la historia y ponerlo como posible valor o dejarlo preestablecido.
		this.motivacion =  Motivacion.ESTAR_CON_WEASLEY;
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}
	
	
}
