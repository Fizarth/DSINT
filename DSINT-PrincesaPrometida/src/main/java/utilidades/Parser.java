package utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

	private static final String CONSULTAQUIENREGEX = "((Q|q)uien es [a-z ,.'-]+ hasta el (A|a)cto\\d+)";
	private static final String CONSULTAQUEREGEX = "((q|Q)ue ha pasado hasta el (a|A)cto\\d+)";
	private static final String CONSULTASIREGEX = "(S|s)i [a-z ,.'-]+ ((es [a-z ,.'-]+)|(no existe))" + "," + "(" +CONSULTAQUEREGEX +"|" + CONSULTAQUIENREGEX + ")";

	
	private static final Pattern quienPattern = Pattern.compile(CONSULTAQUIENREGEX);
	private static final Pattern quePattern = Pattern.compile(CONSULTAQUEREGEX);
	private static final Pattern siPattern = Pattern.compile(CONSULTASIREGEX);
	
	

	private static Parser INSTANCE = null;

	private Parser() {
	}

	private synchronized static void createInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Parser();
		}
	}

	public static Parser getInstance() {
		if (INSTANCE == null)
			createInstance();
		return INSTANCE;
	}

	public static void parsear(String filePath) throws IOException {
		File file = new File(filePath); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		String st; 
		while ((st = br.readLine()) != null) {
		 
			
		}
		
		
		
		

	}

}
