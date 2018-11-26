package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class PadreInigo extends Personaje{
	
	//TODO familiar de 
	
	private Profesion trabajaDe;

	public PadreInigo(Profesion prof, Lugar ubicacionAct) {
		super("Domingo Montoya", Origen.ESPANA, Sexo.HOMBRE, EstadoCivil.INDEFINIDO, EstadoSalud.MUERTO, true,  
				TipoImportancia.SECUNDARIO,ubicacionAct);
		this.trabajaDe = prof;
	}

	public Profesion getTrabajaDe() {
		return trabajaDe;
	}

	public void setTrabajaDe(Profesion profesion) {
		this.trabajaDe = profesion;
	}
	
	
}
