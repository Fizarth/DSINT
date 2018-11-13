package personajes;

import lugares.Lugar;
import utilidades.*;

public class Valerie extends Personaje{
	
	//TODO familiar de 

	public Valerie( Lugar ubicacion) {
		super(EstadoCivil.CASADO, EstadoSalud.VIVO, "Valerie", Origen.FLORIN, true, Sexo.MUJER, 
				TipoImportancia.SECUNDARIO, ubicacion);
	}

	
	
}
