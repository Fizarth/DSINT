package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Westley extends Personaje {
	
	//TODO enemigo de
	//TODO quiere a 
	
	private Motivacion motivacion;//LISTA
	private Profesion trabajaDe;

	public Westley(Profesion prof, Lugar ubicacionAct) {
		super("Westley", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true, 
				TipoImportancia.PROTAGONISTA, ubicacionAct);
		this.motivacion = Motivacion.GANAR_DINERO;
		this.trabajaDe = prof;
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}

	public Profesion getProfesion() {
		return trabajaDe;
	}

	public void setProfesion(Profesion profesion) {
		this.trabajaDe = profesion;
	}

	@Override
	public String toString() {
		String cadena = super.toString();
		return cadena + ".Westley se ve motivado por: "+motivacion+ "y  trabaja de=" + trabajaDe ;
	}
	
	
	
	

}
