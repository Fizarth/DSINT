package personajes;

import lugares.Lugar;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Nieto extends Personaje {

	//TODO familiar de 
	
	public Nieto() {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "El Nieto", Origen.CHICAGO, false, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO);
		
	}
	
	

}
