package personajes;

import lugares.Lugar;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Abuelo extends Personaje {

	//TODO añadir relacion familiar_de

	public Abuelo() {
		super(EstadoCivil.CASADO, EstadoSalud.VIVO, "Abuelo", Origen.CHICAGO,false, Sexo.HOMBRE, TipoImportancia.NARRADOR);
		
	}
	
	
	
}
