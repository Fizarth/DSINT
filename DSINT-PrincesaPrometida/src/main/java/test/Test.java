package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lugares.HabitacionN;
import personajes.Abuelo;
import personajes.Madre;
import personajes.Nieto;
import relaciones.FamiliarDe;
import relaciones.QuiereA;
import relaciones.Relacion;
import utilidades.Consulta;
import utilidades.Modificable;
import utilidades.Parser;
import utilidades.Sexo;

public class Test {

	public static void main(String[] args) {
		/*ArrayList<Consulta> c;
		try {
			 c = (ArrayList<Consulta>) Parser.parsear("C:\\Users\\fires\\Desktop\\Nueva\\input1.txt");
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Abuelo a = new Abuelo(new HabitacionN());
		Nieto n = new Nieto(new HabitacionN());
		
		a.addRelacion(new QuiereA(n));
		a.addRelacion(new FamiliarDe(n));
		a.addRelacion(new FamiliarDe(new Madre(new HabitacionN())));
		n.addRelacion(new FamiliarDe(a));
		
		
		
		System.out.println(Relacion.getRelaciones2personajes(a, n));
		System.out.println(Relacion.getRelaciones2personajes(n, a));
		
		
	}

}
