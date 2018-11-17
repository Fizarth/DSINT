package utilidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

	private static Archivo unicaInstancia;
	BufferedWriter bfwriter;
	
	private Archivo() throws IOException {
		FileWriter flwriter = null;
		flwriter = new FileWriter( "C:\\\\Users\\\\fires\\\\Desktop\\\\Nueva\\\\out.txt");
		bfwriter = new BufferedWriter(flwriter);		
	}
	
	public static Archivo getUnicaInstancia() throws IOException {
		if(unicaInstancia == null)
			unicaInstancia = new Archivo();
		return unicaInstancia;
	}
	
	public void escribir(String s) throws IOException {
		 this.bfwriter.write(s);;
	}
	
	public void cerrarArchivo() throws IOException {
		this.bfwriter.close();
	}
}
