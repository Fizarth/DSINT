package test;

import java.io.IOException;
import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import utilidades.Consulta;
import utilidades.Parser;

public class Main {

	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		//System.out.println(kContainer.verify().getMessages().toString());
	
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		String filePath = args[0];
		
		
		ArrayList<Consulta> consultas = null;
		try {
			consultas = (ArrayList<Consulta>) Parser.parsear(filePath);
		} catch (IOException e) {
			System.err.println("No se ha podido leer el fichero: " + filePath);
			e.printStackTrace();
		}
		
		for (Consulta consulta : consultas) {
			consulta.getTipo();
			
			
			
			kSession.fireAllRules();
			
		}
		
	
	
	}
	
	
}
