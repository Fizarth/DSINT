package utilidades;

public class CharacterDeletor {
	private static final CharacterDeletor INSTANCE = new CharacterDeletor();
	
	private String toDelete = "";
	
	private CharacterDeletor() {}
	
	public static CharacterDeletor getInstance() {
		return INSTANCE;
	}
		
	
	public void setPersonaje(String personaje) {
		toDelete = personaje;
	}
	
	public boolean shouldDelete(String personaje) {
		return personaje.equals(toDelete);
	}
	
	
	public void clear() {
		toDelete="";
	}
	
	
	
	
	
	
	
}
