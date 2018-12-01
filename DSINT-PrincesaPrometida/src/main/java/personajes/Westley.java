package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Westley extends PersonajeCuento {

	public Westley(Lugar ubicacionAct, Profesion profesion, Motivacion motivacion) {
		super("Westley", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO,
				TipoImportancia.PROTAGONISTA, ubicacionAct, profesion, motivacion);
	}

}
