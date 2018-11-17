package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Rey extends Personaje {

	// TODO familiar de

	private TituloNobiliario titulo;
	private Profesion trabajaDe;

	public Rey(Profesion prof, Lugar ubicacionAct) {
		super("El Rey", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.CASADO, EstadoSalud.VIVO, true,
				TipoImportancia.SECUNDARIO, ubicacionAct);
		this.titulo = TituloNobiliario.REY;
		this.trabajaDe = prof;

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
