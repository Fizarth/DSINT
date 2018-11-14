package personajes;

import lugares.Lugar;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Madre extends Personaje{
	
	//TODO familiar de 

	public Madre() {
		super(EstadoCivil.CASADO, EstadoSalud.VIVO, "La Madre", Origen.CHICAGO, false, Sexo.MUJER, 
				TipoImportancia.SECUNDARIO);
	}

	
}
