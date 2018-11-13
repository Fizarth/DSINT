package personajes;

import lugares.Lugar;
import ontologia.Profesion;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Obispo extends Personaje{

	private Profesion profesion;
	
	public Obispo(Lugar ubicacion) {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Obispo Gangoso", Origen.FLORIN, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO, ubicacion);
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	
	
}
