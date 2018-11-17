package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Yalin extends Personaje {

	private Profesion trabajaDe; //LISTA
	private Motivacion motivacion;//LISTA
	
	public Yalin(Profesion prof, Lugar ubicacionAct) {
		super("Yalin", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true,
				TipoImportancia.SECUNDARIO, ubicacionAct);
		this.motivacion = Motivacion.SERVIR_PRINCIPE;
		this.trabajaDe = prof;
	}
	
	public Profesion getTrabajaDe() {
		return trabajaDe;
	}

	public void setTrabajaDe(Profesion trabajaDe) {
		this.trabajaDe = trabajaDe;
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}

	
}
