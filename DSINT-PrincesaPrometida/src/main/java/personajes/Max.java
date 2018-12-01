package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Max extends PersonajeCuento {

	public Max(Lugar ubicacionAct, Profesion profesion, Motivacion motivacion) {
		super("Milagroso Max", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.CASADO, EstadoSalud.VIVO,
				TipoImportancia.SECUNDARIO, ubicacionAct, profesion, motivacion);
	}

}
