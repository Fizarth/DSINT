package personajes;

import ontologia.Lugar;
import ontologia.Profesion;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Motivacion;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Max extends Personaje {

	//TODO familiar de 
	//TODO odia a 
	
	private Motivacion motivacion;
	private Profesion profesion;
	
	public Max(Lugar ubicacion) {
		super(EstadoCivil.CASADO, EstadoSalud.VIVO, "Milagroso Max", Origen.FLORIN, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO, ubicacion);
		this.motivacion = Motivacion.HUMILLAR_PRINCIPE;
		// TODO Auto-generated constructor stub
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	
	
}
