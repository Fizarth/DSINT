package personajes;

import lugares.*;
import utilidades.*;

public class Abuelo extends Personaje {

	// TODO A�adir relacion familiar_de

	public Abuelo(Lugar ubicacionAct) {
		super("Abuelo", Origen.CHICAGO, Sexo.HOMBRE, EstadoCivil.CASADO, EstadoSalud.VIVO, false,
				TipoImportancia.NARRADOR, ubicacionAct);
	}

}
