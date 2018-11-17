package personajes;

import lugares.Lugar;
import profesiones.*;
import utilidades.*;

public class Conde extends Personaje {

	// TODO añadir amigo de
	// TODO añadir conoce_a
	// TODO añadir enemigo de

	private Motivacion motivacion; // hacerlo lista
	private TituloNobiliario titulo;
	private Profesion trabajaDe; //LISTA

	public Conde(Profesion prof, Lugar ubicacionAct) {
		super("Tyrone Rugen", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, true,
				TipoImportancia.SECUNDARIO, ubicacionAct);
		this.motivacion = Motivacion.SERVIR_PRINCIPE;
		this.titulo = TituloNobiliario.CONDE;
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
