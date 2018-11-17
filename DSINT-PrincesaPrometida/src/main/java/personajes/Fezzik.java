package personajes;

import lugares.Lugar;
import profesiones.Profesion;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Motivacion;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Fezzik extends Personaje {

	// TODO amigo de

	private Motivacion motivacion; // LISTA
	private Profesion trabajaDe; //LISTA

	public Fezzik(Profesion prof, Lugar ubicacionAct) {
		super("Fezzik", Origen.TURQUIA, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true,
				TipoImportancia.PROTAGONISTA, ubicacionAct);
		this.motivacion = Motivacion.TENER_TRABAJO;
		this.trabajaDe = prof;
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}

	public Profesion getProfesion() {
		return trabajaDe;
	}

	public void setProfesion(Profesion profesion) {
		this.trabajaDe = profesion;
	}

}
