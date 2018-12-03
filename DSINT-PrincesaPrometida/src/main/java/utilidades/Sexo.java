package utilidades;

public enum Sexo implements Modificable{
	HOMBRE{
		public Object getInstance(String s) {
			return HOMBRE;
		}
	}
	, MUJER
	{
		public Object getInstance(String s) {
			return MUJER;
		}
	}

	
}
