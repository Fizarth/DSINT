package ontologia;

public class Anciana extends Personaje {

	public Anciana(Lugar ubicacion) {
		//TODO en la ontologia tiene estado civil soltera.
		//TODO Ponerle la ubicacion fija y que no pueda cmbiar nunca.
		super(EstadoCivil.INDEFINIDO, EstadoSalud.VIVO, "Ancina Abucheadora", Origen.FLORIN,true, Sexo.MUJER,
				TipoImportancia.SECUNDARIO, ubicacion);
	}
	
	
}
