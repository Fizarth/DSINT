package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Principe extends Personaje {

	// TODO ENEMigo de
	// TODO familiar de
	// TODO prometido de
	// TODO quiere a

	private Motivacion motivacion; // LISTA
	private TituloNobiliario titulo;
	private Profesion trabajaDe;

	public Principe(Profesion prof, Lugar ubicacionAct) {
		super("Principe Humperdink", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true,
				TipoImportancia.PROTAGONISTA, ubicacionAct);
		this.motivacion = Motivacion.DECLARAR_GUERRA;
		this.titulo = TituloNobiliario.PRINCIPE;
		this.trabajaDe = prof;
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
		return trabajaDe;
	}

	public void setProfesion(Profesion profesion) {
		this.trabajaDe = profesion;
	}

}
