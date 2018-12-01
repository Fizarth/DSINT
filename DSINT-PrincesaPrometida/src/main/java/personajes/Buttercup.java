package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Buttercup extends PersonajeCuento {

	public Buttercup(Lugar ubicacionAct, Profesion profesion, Motivacion motivacion) {
		super("Buttercup", Origen.FLORIN, Sexo.MUJER, EstadoCivil.SOLTERO, EstadoSalud.VIVO,
				TipoImportancia.PROTAGONISTA, ubicacionAct, profesion, motivacion);

	}

}
