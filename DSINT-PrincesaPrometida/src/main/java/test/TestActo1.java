package test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class TestActo1 {

	public static void main(String[] args) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		//System.out.println(kContainer.verify().getMessages().toString());

		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup("Acto0").setFocus();
		kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup("Acto1").setFocus();
		kSession.fireAllRules();
	}
}
