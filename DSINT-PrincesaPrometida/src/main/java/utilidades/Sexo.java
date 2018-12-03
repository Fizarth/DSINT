package utilidades;

public enum Sexo {
	HOMBRE, MUJER;
	
	public String getString() {
		switch (this) {
		case HOMBRE:
			return "un hombre";
		case MUJER:
			return "una mujer";
		default:
			return "no lo sé";
		}

	}
}
