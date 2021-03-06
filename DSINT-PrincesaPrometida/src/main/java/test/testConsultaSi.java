package test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import utilidades.*;

public class testConsultaSi {

	public static void main(String[] args) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		// System.out.println(kContainer.verify().getMessages().toString());

		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		ConsultaQuien conq = new ConsultaQuien("Buttercup", Acto.Acto1);
		ConsultaSi consulta = new ConsultaSi("Buttercup","Castillo",conq);
		
		String filePath = "C:\\Users\\fires\\Desktop\\Nueva\\input1.txt";
		Archivo.setPath(filePath + ".output.txt");
		
	
		
		kSession.insert(conq);

		kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup("Acto0").setFocus();		
		kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup("Acto1").setFocus();
		kSession.fireAllRules();
		
		
		
	}
}	
