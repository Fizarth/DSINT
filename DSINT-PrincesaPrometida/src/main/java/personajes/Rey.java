package personajes;

import lugares.Lugar;
import ontologia.Profesion;
import utilidades.*;

public class Rey extends Personaje{
	
	//TODO familiar de 
	
	private TituloNobiliario titulo;
	private Profesion profesion;

	public Rey( Lugar ubicacion) {
		super(EstadoCivil.CASADO, EstadoSalud.VIVO, "El Rey", Origen.FLORIN, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO, ubicacion);
		this.titulo = TituloNobiliario.REY;
		
		
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
