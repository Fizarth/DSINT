package personajes;

import lugares.*;
import utilidades.*;

public class Anciana extends Personaje {

	public Anciana(Lugar ubicacionAct) {
		super("Ancina Abucheadora", Origen.FLORIN, Sexo.MUJER, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true,
				TipoImportancia.SECUNDARIO, ubicacionAct);
	}

}
