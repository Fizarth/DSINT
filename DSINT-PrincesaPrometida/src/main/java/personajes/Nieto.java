package personajes;

import lugares.*;
import utilidades.*;

public class Nieto extends Personaje {

	// TODO familiar de

	public Nieto(Lugar ubicacionAct) {
		super("El Nieto", Origen.CHICAGO, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.ENFERMO, false,
				TipoImportancia.SECUNDARIO, ubicacionAct);
	}

}
