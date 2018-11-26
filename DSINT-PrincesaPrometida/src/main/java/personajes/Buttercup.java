package personajes;

import lugares.Lugar;
import profesiones.*;
import utilidades.*;

public class Buttercup extends Personaje {
	// TODO a�adir Amigo de
	// TODO a�adir odia_a
	// TODO a�adir quiere_a
	// TODO como poner posteriormente que etsta prometida

	private Motivacion motivacion; // Motivaciones tiene que ser lista
	private Profesion trabajaDe; //LISTA
 
	public Buttercup(Profesion prof, Lugar ubicacionAct) {
		super("Buttercup", Origen.FLORIN, Sexo.MUJER, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true,
				TipoImportancia.PROTAGONISTA, ubicacionAct);
		this.motivacion = Motivacion.ESTAR_CON_WESTLEY;
		this.trabajaDe = prof; 
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}

	public Profesion getTrabajaDe() {
		return trabajaDe;
	}

	public void setTrabajaDe(Profesion profesion) {
		this.trabajaDe = profesion;
	}

}
