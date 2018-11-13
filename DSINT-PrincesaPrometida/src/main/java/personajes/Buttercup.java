package personajes;

import lugares.Lugar;
import ontologia.Profesion;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Motivacion;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Buttercup extends Personaje{
	//TODO a�adir Amigo de
	//TODO a�adir odia_a
	//TODO a�adir quiere_a
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
