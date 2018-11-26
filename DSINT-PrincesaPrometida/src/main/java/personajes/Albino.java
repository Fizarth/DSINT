package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Albino extends Personaje {

	private Profesion trabajaDe; //LISTA
	// TODO A�adir conoce_a

	public Albino(Profesion profesion, Lugar ubicacionAct) {
		super("Jai", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.INDEFINIDO, EstadoSalud.VIVO, true,
				TipoImportancia.SECUNDARIO, ubicacionAct);
		this.trabajaDe = profesion;
	}

	public Profesion getTrabajaDe() {
		return trabajaDe;
	}

	public void setTrabajaDe(Profesion trabajaDe) {
		this.trabajaDe = trabajaDe;
	}

}
