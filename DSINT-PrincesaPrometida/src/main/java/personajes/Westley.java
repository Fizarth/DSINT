package personajes;

import lugares.Lugar;
import profesiones.Profesion;
import utilidades.*;

public class Westley extends Personaje {
	
	//TODO enemigo de
	//TODO quiere a 
	
	private Motivacion motivacion;
	private Profesion profesion;

	public Westley(Lugar ubicacion) {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Weasley", Origen.FLORIN, true, Sexo.HOMBRE, 
				TipoImportancia.PROTAGONISTA, ubicacion);
		this.motivacion = Motivacion.GANAR_DINERO;
	}
	
	

}
