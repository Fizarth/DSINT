package personajes;

import lugares.Lugar;
import utilidades.*;

public class Yalin extends Personaje {

	private Motivacion motivacion;
	
	public Yalin() {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Yalin", Origen.FLORIN, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO);
		this.motivacion = Motivacion.SERVIR_PRINCIPE;
		// TODO Auto-generated constructor stub
	}

	
}
