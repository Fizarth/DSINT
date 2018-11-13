package personajes;

import lugares.Lugar;
import ontologia.Profesion;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class PadreInigo extends Personaje{
	
	//TODO familiar de 
	
	private Profesion profesion;

	public PadreInigo( Lugar ubicacion) {
		super(EstadoCivil.INDEFINIDO, EstadoSalud.MUERTO, "Domingo Montoya", Origen.ESPANA, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO, ubicacion);
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}
	
	
}
