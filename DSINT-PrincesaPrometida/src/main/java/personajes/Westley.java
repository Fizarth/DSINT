package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Westley extends Personaje {
	
	//TODO enemigo de
	//TODO quiere a 
	
	private Motivacion motivacion;//LISTA
	private Profesion trabajaDe;

<<<<<<< HEAD
	public Westley() {
		super("Wesley", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true, 
				TipoImportancia.PROTAGONISTA);
=======
	public Westley(Profesion prof, Lugar ubicacionAct) {
		super("Westley", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true, 
				TipoImportancia.PROTAGONISTA, ubicacionAct);
>>>>>>> branch 'master' of https://github.com/Fizarth/DSINT.git
		this.motivacion = Motivacion.GANAR_DINERO;
		//this.trabajaDe = prof;
		//Profesion prof, Lugar ubicacionAct
		//ubicacionAct
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
	
	
	
	

}
