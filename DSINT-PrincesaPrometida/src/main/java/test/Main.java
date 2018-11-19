package test;

import java.io.IOException;
import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import utilidades.Acto;
import utilidades.Consulta;
import utilidades.ConsultaQue;
import utilidades.ConsultaQuien;
import utilidades.Parser;

public class Main {
	
	private static final KieServices ks = KieServices.Factory.get();
	private static final KieContainer kContainer = ks.getKieClasspathContainer();
	private static final KieSession kSession = kContainer.newKieSession("ksession-rules");
	

	public static void main(String[] args) {
		
		//System.out.println(kContainer.verify().getMessages().toString());
	
		
		
		String filePath = args[0];
		
		
		ArrayList<Consulta> consultas = null;
		try {
			consultas = (ArrayList<Consulta>) Parser.parsear(filePath);
		} catch (IOException e) {
			System.err.println("No se ha podido leer el fichero: " + filePath);
			e.printStackTrace();
		}
		
		
		kSession.fireAllRules();
		for (Consulta consulta : consultas) {
			switch (consulta.getTipo()) {
				case "ConsultaQue":
					ConsultaQue consultaQue = (ConsultaQue) consulta;
					ejecutarHastaActo(consultaQue.getActo());
					kSession.insert(consultaQue);
					
					break;
				case "ConsultaQuien":
					ConsultaQuien consultaQuien = (ConsultaQuien) consulta;
					ejecutarHastaActo(consultaQuien.getActo());
					kSession.insert(consultaQuien);
					
					break;
	
				default:
					break;
			}
			
			
			
			kSession.fireAllRules();
			
			
		}
		
	
	
	}
	

	
	private static void ejecutarHastaActo(Acto acto) {
		for(int i = 0; i < acto.getNumActo(); i++){
			kSession.getAgenda().getAgendaGroup("Acto"+i).setFocus();
			kSession.fireAllRules();
		}
	}
	
	
}



