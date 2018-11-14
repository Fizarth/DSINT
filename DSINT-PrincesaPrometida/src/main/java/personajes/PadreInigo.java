package personajes;

import lugares.Lugar;
import profesiones.Profesion;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class PadreInigo extends Personaje{
	
	//TODO familiar de 
	
	private Profesion profesion;

	public PadreInigo() {
		super(EstadoCivil.INDEFINIDO, EstadoSalud.MUERTO, "Domingo Montoya", Origen.ESPANA, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO);
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}
	
	
}
