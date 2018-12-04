package utilidades;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Parser {

	private static final String CONSULTAQUIENREGEX = "((Q|q)uien es [a-zA-Z ,.'-]+ hasta el (A|a)cto\\d+)";
	private static final String CONSULTAQUEREGEX = "((q|Q)ue ha pasado hasta el (a|A)cto\\d+)";
	private static final String CONSULTASIREGEX = "(S|s)i [a-zA-Z ,.'-]+ ((es [a-zA-Z ,.'-]+)|(no existe))" + ", " + "(" + CONSULTAQUEREGEX +"|" + CONSULTAQUIENREGEX + ")";
			//"(S|s)i [a-zA-Z ,.'-]+ ((es [a-zA-Z ,.'-]+)|(no existe)), ((q|Q)ue ha pasado hasta el (a|A)cto\\d+)|((Q|q)uien es [a-zA-Z ,.'-]+ hasta el (A|a)cto\\d+)";
	
	private static final Pattern quienPattern = Pattern.compile(CONSULTAQUIENREGEX);
	private static final Pattern quePattern = Pattern.compile(CONSULTAQUEREGEX);
	private static final Pattern siPattern = Pattern.compile(CONSULTASIREGEX);
	

	public static List<Consulta> parsear(String filePath) throws IOException {
		List<Consulta> consultas = new ArrayList<>();
		
		File file = new File(filePath); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		String line; 
		//System.out.println("Iniciando el Parser");
		while ((line = br.readLine()) != null) {
			System.out.println("Linea a tratar: " + line);
			
			if(isConsultaQuien(line)) consultas.add(consultaQuienFromLine(line));
			
			else if (isConsultaQue(line)) consultas.add(consultaQueFromLine(line));
				
			else if (isConsultaSi(line)) consultas.add(consultaSiFromLine(line));
			
			else {
				System.out.println("Linea: " + line + " no aceptada");
				Archivo.getUnicaInstancia().escribir("No tentiendo la pregunta acerca de la película\n");
			}
			
		}
		
		br.close();
		return consultas;
	}
	
	
	private static boolean isConsultaQuien(String line) {
		return quienPattern.matcher(line).matches();
	}
	private static boolean isConsultaQue(String line) {
		return quePattern.matcher(line).matches();
	}
	private static boolean isConsultaSi(String line) {
		return siPattern.matcher(line).matches();
	}
	
	private static ConsultaQuien consultaQuienFromLine(String line) {
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
		
		return new ConsultaQuien(nombre, Acto.get(palabras[palabras.length-1]));
		
	}
	
	
	private static ConsultaQue consultaQueFromLine(String line) {
		//System.out.println("Consulta tipo Que encontrada");
		String[] palabras = line.split(" ");

		return new ConsultaQue(Acto.get(palabras[palabras.length-1]));	
	}
	
	private static ConsultaSi consultaSiFromLine(String line) {
		String[] palabras = line.split(" ");
		
		String nombre = "";
		String valorAtributo = "";
		Consulta consulta = null;
		
		
		// buscar consulta
		int i = 0;
		do i++; while(!palabras[i].contains(","));
		i++;
		
		// Construir string con solo la consulta
		StringBuilder builder = new StringBuilder();
		for (int j = i; j < palabras.length; j++) {
			builder.append(palabras[j]+ " ");
		}
		builder.deleteCharAt(builder.length()-1);
		
		
		String consultaString = String.join(" ", builder.toString());
	
		
		
		// Crear consulta correspondiente
		if (isConsultaQue(consultaString)) {
			consulta = consultaQueFromLine(consultaString);
		}
		else consulta = consultaQuienFromLine(consultaString);
		
		
		
		
		// Tratar parte <condicion>
		
		for (i = 1; !(palabras[i].equals("es") || palabras[i].equals("no")); i++) {
			nombre +=palabras[i];
		}
		
		
		//  condicion <nombre> no existe
		if (palabras[i].equals("no")) {
			return new ConsultaSi(nombre, consulta);
		}
		
		
		// obtener valor atributo
		
		while (!palabras[i++].contains(","))
			valorAtributo += palabras[i] + " ";
			
		// eliminar "," && " "
		valorAtributo = valorAtributo.substring(0, valorAtributo.length()-2);
			
	
		
		return new ConsultaSi(nombre, valorAtributo, consulta);
		
		
	}
	

}
