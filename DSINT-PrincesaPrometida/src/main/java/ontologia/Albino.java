package ontologia;

public class Albino extends Personaje{

	private Profesion trabaja_de;
	//TODO aañadir conoce_a
	
	public Albino(EstadoCivil estadoCivil, EstadoSalud salud, String nombre, Origen origen, boolean cuento,
			Sexo sexo, TipoImportancia importancia, Lugar ubicacion) {
		super(estadoCivil, salud, nombre, origen,cuento, sexo, importancia, ubicacion);
	}
	
	public Profesion getTrabaja_de() {
		return trabaja_de;
	}

	public void setTrabaja_de(Profesion trabaja_de) {
		this.trabaja_de = trabaja_de;
	}
	

	
	
	
}
