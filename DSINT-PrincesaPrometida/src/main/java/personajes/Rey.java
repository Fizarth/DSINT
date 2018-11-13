package personajes;

import lugares.Lugar;
import profesiones.Profesion;
import utilidades.*;

public class Rey extends Personaje{
	
	//TODO familiar de 
	
	private TituloNobiliario titulo;
	private Profesion profesion;

	public Rey(EstadoCivil estadoCivil, EstadoSalud salud, String nombre, Origen origen, boolean cuento, Sexo sexo,
			TipoImportancia importancia, Lugar ubicacion) {
		super(estadoCivil, salud, nombre, origen, cuento, sexo, importancia, ubicacion);
		
	}
	
	

}
