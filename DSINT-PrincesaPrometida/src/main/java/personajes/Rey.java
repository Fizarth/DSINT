package personajes;

import lugares.Lugar;
import profesiones.Profesion;
import utilidades.*;

public class Rey extends Personaje{
	
	//TODO familiar de 
	
	private TituloNobiliario titulo;
	private Profesion profesion;

	public Rey() {
		super(EstadoCivil.CASADO, EstadoSalud.VIVO, "El Rey", Origen.FLORIN, true, Sexo.HOMBRE, 
				TipoImportancia.SECUNDARIO);
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
