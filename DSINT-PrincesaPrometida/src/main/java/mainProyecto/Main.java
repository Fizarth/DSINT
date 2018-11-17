package mainProyecto;

import java.io.IOException;
import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import utilidades.*;
import utilidades.Parser;

public class Main {
	
	private static KieServices ks = KieServices.Factory.get();
	private static KieContainer kContainer = ks.getKieClasspathContainer();
	private static KieSession kSession = kContainer.newKieSession("ksession-rules");

	public static void main(String[] args) {
		ArrayList<Consulta> c = new ArrayList<Consulta>();
		try {
			c = (ArrayList<Consulta>) Parser.parsear("C:\\Users\\fires\\Desktop\\Nueva\\input1.txt");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		System.out.println(kContainer.verify().getMessages().toString());

		
		while (!c.isEmpty()) {
			switch (c.get(0).getTipo()) {

			case "ConsultaQuien":
				System.out.println("CONSULTA QUIEN");
				ConsultaQuien cquien = ((ConsultaQuien) c.get(0));
				System.out.println(cquien.getNombre() + " " + cquien.getActo());
				EjecutarHastaActo(cquien.getActo());
				
				break;
			case "ConsultaQue":
				System.out.println("CONSULTA QUE");
				ConsultaQue cque = ((ConsultaQue) c.get(0));
				System.out.println(cque.getActo());
				EjecutarHastaActo(cque.getActo());
				break;
			}
			c.remove(0);

		}

	}
	

	private static void EjecutarHastaActo(Acto a) {
		
		switch (a) {
			
		case Acto0:
			System.out.println("Ejecuto hasta el acto0");
			kSession.getAgenda().getAgendaGroup("Acto0").setFocus();
	       	kSession.fireAllRules();
			break;
		case Acto1:
			System.out.println("EjecutoHasta acto 1");
			kSession.getAgenda().getAgendaGroup("Acto0").setFocus();
			kSession.fireAllRules();
			kSession.getAgenda().getAgendaGroup("Acto1").setFocus();
	       	kSession.fireAllRules();
			break;
		default:
			System.out.println("No se contempla este acto");
			break;
		
		}
				
	}
	
}


