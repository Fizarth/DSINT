package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Principe extends PersonajeCuento {

	public Principe(Lugar ubicacionAct, Profesion profesion, Motivacion motivacion) {
		super("Principe Humperdink", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO,
				TipoImportancia.PROTAGONISTA, ubicacionAct, profesion, motivacion);

	}

}
