package personajes;

import lugares.Lugar;
import profesiones.Profesion;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Motivacion;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;
import utilidades.TituloNobiliario;

public class Conde extends Personaje{

	//TODO a�adir amigo de
	//TODO al�adir conoce_a
	//TODO a�adir enemigo de
	
	private Motivacion motivacion;
	private TituloNobiliario titulo;
	private Profesion profesion;
	
	public Conde(Lugar ubicacion) {
		super(EstadoCivil.SOLTERO, EstadoSalud.VIVO, "Tyrone Rugen", Origen.FLORIN, true, Sexo.HOMBRE,
				TipoImportancia.SECUNDARIO, ubicacion);
		this.motivacion = Motivacion.SERVIR_PRINCIPE;
		this.titulo = TituloNobiliario.CONDE;
		//TODO hay qe ver como cambia para estudiar dolor. en que momento y eso. o si ponerlo ocmo lista para que 
			//pueda tener varias.
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
