package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Albino extends Personaje {

	private Profesion trabajaDe; //LISTA
	// TODO Añadir conoce_a

	public Albino(Profesion profesion, Lugar ubicacionAct) {
		super("Jai", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.INDEFINIDO, EstadoSalud.VIVO, true,
				TipoImportancia.SECUNDARIO, ubicacionAct);
		this.trabajaDe = profesion;
	}

	public Profesion getTrabaja_de() {
		return trabajaDe;
	}

	public void setTrabaja_de(Profesion trabajaDe) {
		this.trabajaDe = trabajaDe;
	}

}
