package personajes;

import lugares.Lugar;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Abuelo extends Personaje {

	//TODO añadir relacion familiar_de

	public Abuelo(EstadoCivil estadoCivil, EstadoSalud salud, String nombre, Origen origen, boolean cuento,
			Sexo sexo, TipoImportancia importancia, Lugar ubicacion) {
		super(estadoCivil, salud, nombre, origen,cuento, sexo, importancia, ubicacion);
		
	}
	
	
	
}
