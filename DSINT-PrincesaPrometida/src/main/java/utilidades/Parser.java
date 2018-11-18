package utilidades;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

	private static final String CONSULTAQUIENREGEX = "((Q|q)uien es [a-zA-Z ,.'-]+ hasta el (A|a)cto\\d+)";
	private static final String CONSULTAQUEREGEX = "((q|Q)ue ha pasado hasta el (a|A)cto\\d+)";
	private static final String CONSULTASIREGEX = "(S|s)i [a-z ,.'-]+ ((es [a-z ,.'-]+)|(no existe))" + "," + "(" +CONSULTAQUEREGEX +"|" + CONSULTAQUIENREGEX + ")";

	
	private static final Pattern quienPattern = Pattern.compile(CONSULTAQUIENREGEX);
	private static final Pattern quePattern = Pattern.compile(CONSULTAQUEREGEX);
	private static final Pattern siPattern = Pattern.compile(CONSULTASIREGEX);
	
	

	

	public static List<Consulta> parsear(String filePath) throws IOException {
		List<Consulta> consultas = new ArrayList<>();
		
		File file = new File(filePath); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		Matcher m;
		String line; 
		//System.out.println("Iniciando el Parser");
		while ((line = br.readLine()) != null) {
			System.out.println("Linea a tratar: " + line);
			
			
			m = quienPattern.matcher(line);
			if (m.matches()) {
				//System.out.println("Consulta tipo Quien encontrada");
				String[] palabras = line.split(" ");
			
				
				int i = 0;
				while (!palabras[i].equals("hasta")) {
					i++;
				}
				
				
				String nombre = new String();
				// nombre compuesto
				if (i > 3) {
					int j = 2;
					while (j < i ) {
						nombre.concat(palabras[j]);
						nombre.concat(" ");
					}
					
				} else {
					nombre = palabras[i-1];
				}
				
				
				
				
				consultas.add(new ConsultaQuien(nombre, Acto.get(palabras[palabras.length-1])));
				//System.out.println("Consulta tipo Quien añadida");
				continue;
			}
			
			m = quePattern.matcher(line);
			if (m.matches()) {
				//System.out.println("Consulta tipo Que encontrada");
				String[] palabras = line.split(" ");
				
			
				consultas.add(new ConsultaQue(Acto.get(palabras[palabras.length-1])));
				//System.out.println("Consulta tipo Que añadida");
				continue;
			}
			
			
			
		}
		
		
		return consultas;
		
		
		
		

	}

}
