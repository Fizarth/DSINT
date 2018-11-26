package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Pirata extends Personaje {

	private Motivacion motivacion; //LISTA
	private Profesion trabajaDe; //LIISTA
	
	public Pirata(Profesion prof, Lugar ubicacionAct) {
		super("Robert el Pirata", Origen.INGLATERRA, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true, 
				TipoImportancia.SECUNDARIO, ubicacionAct);
		this.motivacion = Motivacion.SECUESTRAR_PRINCESA;
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
