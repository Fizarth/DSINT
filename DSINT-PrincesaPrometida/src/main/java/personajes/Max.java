package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Max extends Personaje {

	//TODO familiar de 
	//TODO odia a 
	
	private Motivacion motivacion; //LISTA
	private Profesion trabajaDe;
	
	public Max(Profesion prof, Lugar ubicacionAct) {
		super("Milagroso Max", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.CASADO, EstadoSalud.VIVO, true,  
				TipoImportancia.SECUNDARIO, ubicacionAct);
		this.motivacion = Motivacion.HUMILLAR_PRINCIPE;
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
