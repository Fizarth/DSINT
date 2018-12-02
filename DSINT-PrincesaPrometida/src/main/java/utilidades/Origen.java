package utilidades;

public enum Origen {
	SICILIA, GROENLANDIA, ESPANA, FLORIN, GUILDER, CHICAGO, TURQUIA, INGLATERRA, DESCONOCIDO;
	
	public String getString() {
		switch (this) {
		case SICILIA:
			return "Sicilia";
		case GROENLANDIA:
			return "Groenlandia";
		case ESPANA:
			return "España";
		case FLORIN:
			return "Florin";
		case GUILDER:
			return "Guilder";
		case CHICAGO:
			return "Chicago";
		case TURQUIA:
			return "Turquía";
		case INGLATERRA:
			return "Inglaterra";
		case DESCONOCIDO:
			return "desconocido";

		default:
			return "no lo sé";
		}

	}
}
