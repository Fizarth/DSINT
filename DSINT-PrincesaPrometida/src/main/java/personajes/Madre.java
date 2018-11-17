package personajes;

import lugares.*;
import utilidades.*;

public class Madre extends Personaje {

	// TODO familiar de

	public Madre(Lugar ubicacionAct) {
		super("La Madre", Origen.CHICAGO, Sexo.MUJER, EstadoCivil.CASADO, EstadoSalud.VIVO, false,
				TipoImportancia.SECUNDARIO, ubicacionAct);
	}
}
