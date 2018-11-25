package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import utilidades.Consulta;
import utilidades.Parser;

public class Test {

	public static void main(String[] args) {
		ArrayList<Consulta> c;
		try {
			 c = (ArrayList<Consulta>) Parser.parsear("C:\\Users\\fires\\Desktop\\Nueva\\input1.txt");
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
