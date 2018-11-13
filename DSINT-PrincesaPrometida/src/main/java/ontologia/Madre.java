package ontologia;

public class Madre extends Personaje{
	
	//TODO familiar de 

	public Madre(EstadoCivil estadoCivil, EstadoSalud salud, String nombre, Origen origen, boolean cuento, Sexo sexo,
			TipoImportancia importancia, Lugar ubicacion) {
		super(EstadoCivil.CASADO, EstadoSalud.VIVO, "La Madre", Origen.CHICAGO, false, Sexo.MUJER, 
				TipoImportancia.SECUNDARIO, ubicacion);
	}

	
}
