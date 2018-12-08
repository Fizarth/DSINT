package test;

import lugares.Bosque;
import personajes.Abuelo;

public class PruebaClase {

	public static void main(String[] args) {
		Abuelo a = new Abuelo(new Bosque());
		System.out.println(a.getClass().getCanonicalName());
		
		String className = "personajes.Abuelo";
		try {
			Class<?> cls = Class.forName(className);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}


}
