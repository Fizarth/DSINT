package personajes;

import lugares.*;
import profesiones.Profesion;
import utilidades.*;

public class Pirata extends Personaje {

	private Motivacion motivacion;
	private Profesion profesion;
	
	public Pirata() {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Robert el Pirata", Origen.INGLATERRA, true, Sexo.HOMBRE,
				TipoImportancia.SECUNDARIO);
		this.motivacion = Motivacion.SECUESTRAR_PRINCESA;
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
