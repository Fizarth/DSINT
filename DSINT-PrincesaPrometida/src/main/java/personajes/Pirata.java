package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Pirata extends PersonajeCuento {

	public Pirata(Lugar ubicacionAct, Profesion profesion, Motivacion motivacion) {
		super("Robert el Pirata", Origen.INGLATERRA, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO,
				TipoImportancia.SECUNDARIO, ubicacionAct, profesion, motivacion);
	}

}
