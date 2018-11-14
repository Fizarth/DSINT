package utilidades;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList<Consulta> c;
		try {
			 c = (ArrayList<Consulta>) Parser.parsear("/home/norberto/Downloads/input1.txt");
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
