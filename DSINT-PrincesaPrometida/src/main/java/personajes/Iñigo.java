package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class I�igo extends Personaje {

	// TODO amigo de
	// TODO enemigo de
	// TODO familia de
	// TODO trabaja de

	private Motivacion motivacion; // LISTA
	private Profesion trabajaDe; // LISTA

	public I�igo(Profesion prof, Lugar ubicacionAct) {
		super("I�igo Montoya", Origen.ESPANA, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true,
				TipoImportancia.PROTAGONISTA, ubicacionAct);
		this.motivacion = Motivacion.VENGAR_PADRE;
		trabajaDe = prof;
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

	public void setTrabajaDe(Profesion trabajaDe) {
		this.trabajaDe = trabajaDe;
	}

}
