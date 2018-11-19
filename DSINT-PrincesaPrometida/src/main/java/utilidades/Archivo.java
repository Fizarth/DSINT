package utilidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

	private static Archivo unicaInstancia;
	BufferedWriter bfwriter;
	private static String path = null;
	
	
	private Archivo() throws IOException {
		if (path == null) throw new IOException("Tienes que usar el set antes de obtener la instancia");
		
		FileWriter flwriter = null;
		flwriter = new FileWriter( Archivo.path);
		bfwriter = new BufferedWriter(flwriter);		
	}
	
	public static Archivo getUnicaInstancia() throws IOException {
		if(unicaInstancia == null)
			unicaInstancia = new Archivo();
		return unicaInstancia;
	}
	
	public void escribir(String s) throws IOException {
		 this.bfwriter.write(s);
	}
	
	public void cerrarArchivo() throws IOException {
		this.bfwriter.close();
	}
	
	public static void setPath(String path) {
		Archivo.path = path;
	}
	
}
