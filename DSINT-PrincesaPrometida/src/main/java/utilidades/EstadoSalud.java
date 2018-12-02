package utilidades;

public enum EstadoSalud {
	ENFERMO, VIVO, BORRACHO, MUERTO, MEDIO_MUERTO, EN_PELIGRO, INCONSCIENTE;

	public String getString() {
		switch (this) {
		case ENFERMO:
			return "enfermo";
		case VIVO:
			return "vivo";
		case BORRACHO:
			return "borracho";
		case MUERTO:
			return "muerto";
		case MEDIO_MUERTO:
			return "medio muerto";
		case EN_PELIGRO:
			return "en peligro";
		case INCONSCIENTE:
			return "inconsciente";
		default:
			return "no se sabe";
		}

	}
}
