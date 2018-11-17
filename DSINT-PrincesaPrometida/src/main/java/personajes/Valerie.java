package personajes;

import lugares.*;
import utilidades.*;

public class Valerie extends Personaje {

	// TODO familiar de

	public Valerie(Lugar ubicacionAct) {
		super("Valerie", Origen.FLORIN, Sexo.MUJER, EstadoCivil.CASADO, EstadoSalud.VIVO, true,
				TipoImportancia.SECUNDARIO, ubicacionAct);
	}

}
