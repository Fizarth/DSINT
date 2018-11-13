package personajes;

import lugares.Lugar;
import profesiones.Profesion;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Motivacion;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Fezzik extends Personaje{
	
	//TODO amigo de 

	private Motivacion motivacion;
	private Profesion profesion;

	public Fezzik(EstadoCivil estadoCivil, EstadoSalud salud, String nombre, Origen origen, boolean cuento, Sexo sexo,
			TipoImportancia importancia, Lugar ubicacion) {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Fezzik", Origen.TURQUIA, true, Sexo.HOMBRE, TipoImportancia.PROTAGONISTA, 
				ubicacion);
		this.motivacion = Motivacion.TENER_TRABAJO;
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
