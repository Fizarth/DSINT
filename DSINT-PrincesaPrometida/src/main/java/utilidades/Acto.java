package utilidades;

import java.util.HashMap;
import java.util.Map;

public enum Acto {
	Acto0("Acto0"),
	Acto1("Acto1"),
	Acto2("Acto2"),
	Acto3("Acto3"),
	Acto4("Acto4"),
	Acto5("Acto5"),
	ActoFinal("ActoFinal");
	
	private String acto;
	
	Acto(String acto) {
		this.acto = acto;
	}
	
	
	public String getActo() {
		return acto;
	}
	
	
	private static final Map<String, Acto> lookup = new HashMap<>();
	
	static {
		for (Acto acto : Acto.values()) {
			lookup.put(acto.getActo(), acto);
		}
	}
	
	
	public static Acto get(String actoS) {
		return lookup.get(actoS);
	}
	
	
}
