package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class PersonajeCuento extends Personaje {

	private Profesion profesion;
	private Motivacion motivacion;
	private TituloNobiliario tit;

	public PersonajeCuento(String nombre, Origen origen, Sexo sexo, EstadoCivil estadoCivil, EstadoSalud salud,
			TipoImportancia importancia, Lugar ubicacionAct, Profesion profesion, Motivacion motivacion) {

		super(nombre, origen, sexo, estadoCivil, salud, importancia, ubicacionAct);

		this.profesion = profesion;
		this.motivacion = motivacion;
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	public Motivacion getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(Motivacion motivacion) {
		this.motivacion = motivacion;
	}

	public TituloNobiliario getTit() {
		return tit;
	}

	public void setTit(TituloNobiliario tit) {
		this.tit = tit;
	}

	@Override
	public String toString() {
		String inf = super.toString();
		inf = "Este personaje pertecene al cuento." + inf + " Se dedica a " + profesion + " y tiene como motivación "
				+ motivacion.getString() + ".";
		if (tit != null)
			inf += " Es un noble, su título es " + tit.getString() + ".";
		return inf;
	}

}
