package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Obispo extends Personaje{

	private Profesion trabajaDe;
	
	public Obispo(Profesion prof, Lugar ubicacionAct) {
		super("Obispo Gangoso", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true,  
				TipoImportancia.SECUNDARIO, ubicacionAct);
		this.trabajaDe = prof;
	}

	public Profesion getProfesion() {
		return trabajaDe;
	}

	public void setProfesion(Profesion profesion) {
		this.trabajaDe = profesion;
	}

	
	
}
