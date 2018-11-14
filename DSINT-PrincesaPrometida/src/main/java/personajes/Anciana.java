package personajes;

import lugares.Lugar;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Anciana extends Personaje {

	public Anciana() {
		//TODO en la ontologia tiene estado civil soltera.
		//TODO Ponerle la ubicacion fija y que no pueda cmbiar nunca.
		super(EstadoCivil.INDEFINIDO, EstadoSalud.VIVO, "Ancina Abucheadora", Origen.FLORIN,true, Sexo.MUJER,
				TipoImportancia.SECUNDARIO);
	}
	
	
}
