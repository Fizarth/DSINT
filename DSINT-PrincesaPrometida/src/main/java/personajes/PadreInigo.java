package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class PadreInigo extends PersonajeCuento{
	
	public PadreInigo(Lugar ubicacionAct, Profesion profesion) {
		super("Domingo Montoya", Origen.ESPANA, Sexo.HOMBRE, EstadoCivil.INDEFINIDO, EstadoSalud.VIVO,  
				TipoImportancia.SECUNDARIO,ubicacionAct, profesion, Motivacion.DESCONOCIDA);
		
	}

	
}
