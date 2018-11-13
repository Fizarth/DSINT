package personajes;

import lugares.Lugar;
import utilidades.*;

public class Yalin extends Personaje {

	private Motivacion motivacion;
	
	public Yalin(Lugar ubicacion) {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Yalin", Origen.FLORIN, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO, ubicacion);
		this.motivacion = Motivacion.SERVIR_PRINCIPE;
		// TODO Auto-generated constructor stub
	}

	
}
