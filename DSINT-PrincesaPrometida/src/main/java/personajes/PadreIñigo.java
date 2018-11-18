package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class PadreIñigo extends Personaje{
	
	//TODO familiar de 
	
	private Profesion trabajaDe;

	public PadreIñigo(Profesion prof, Lugar ubicacionAct) {
		super("Domingo Montoya", Origen.ESPANA, Sexo.HOMBRE, EstadoCivil.INDEFINIDO, EstadoSalud.MUERTO, true,  
				TipoImportancia.SECUNDARIO,ubicacionAct);
		this.trabajaDe = prof;
	}

	public Profesion getProfesion() {
		return trabajaDe;
	}

	public void setProfesion(Profesion profesion) {
		this.trabajaDe = profesion;
	}
	
	
}
