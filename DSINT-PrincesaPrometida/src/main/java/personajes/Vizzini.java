package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Vizzini extends Personaje{
	
	//TODO familiar de 
	private Profesion trabajaDe;
	private Motivacion motivacion;
	
	public Vizzini(Profesion prof, Lugar ubicacionAct) {
		super("Vizzini", Origen.SICILIA, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true,  
				TipoImportancia.SECUNDARIO, ubicacionAct);
		this.setTrabajaDe(prof);
		this.setMotivacion(Motivacion.DECLARAR_GUERRA);
	}

	public Profesion getTrabajaDe() {
		return trabajaDe;
	}

	public void setTrabajaDe(Profesion trabajaDe) {
		this.trabajaDe = trabajaDe;
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}
	
	

}
