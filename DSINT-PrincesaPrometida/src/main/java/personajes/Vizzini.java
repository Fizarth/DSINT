package personajes;

import lugares.Lugar;
import utilidades.*;

public class Vizzini extends Personaje{
	
	//TODO familiar de 

	public Vizzini( Lugar ubicacion) {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Vizzini", Origen.SICILIA, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO, ubicacion);
		
	}
	
	

}
