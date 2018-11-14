package personajes;

import lugares.Lugar;
import profesiones.Profesion;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Albino extends Personaje{

	private Profesion trabaja_de;
	//TODO aa�adir conoce_a
	
	public Albino() {
		super(EstadoCivil.INDEFINIDO, EstadoSalud.VIVO, "Jai", Origen.FLORIN,true, Sexo.HOMBRE,
				TipoImportancia.SECUNDARIO);
	}
	
	public Profesion getTrabaja_de() {
		return trabaja_de;
	}

	public void setTrabaja_de(Profesion trabaja_de) {
		this.trabaja_de = trabaja_de;
	}
	

	
	
	
}
