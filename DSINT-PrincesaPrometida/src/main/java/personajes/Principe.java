package personajes;

import lugares.Lugar;
import profesiones.Profesion;
import utilidades.*;

public class Principe extends Personaje {
	
	//TODO ENEMigo de 
	//TODO familiar de
	//TODO prometido de 
	//TODO quiere a
	
	private Motivacion motivacion;
	private TituloNobiliario titulo;
	private Profesion profesion;
	
	public Principe() {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Principe Humperdink", Origen.FLORIN, true, Sexo.HOMBRE, 
				TipoImportancia.PROTAGONISTA);
		this.motivacion = Motivacion.DECLARAR_GUERRA;
		this.titulo = TituloNobiliario.PRINCIPE;
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}

	public TituloNobiliario getTitulo() {
		return titulo;
	}

	public void setTitulo(TituloNobiliario titulo) {
		this.titulo = titulo;
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}
	
	

	
}
