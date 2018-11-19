package test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import utilidades.Acto;
import utilidades.ConsultaQue;

public class TestActo1 {

	public static void main(String[] args) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		//System.out.println(kContainer.verify().getMessages().toString());

		KieSession kSession = kContainer.newKieSession("ksession-rules");
		ConsultaQue q= new ConsultaQue(Acto.Acto1);
		kSession.insert(q);
		kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup(q.getActo().getActo()).setFocus();
		kSession.fireAllRules();
		
		/*kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup("Acto0").setFocus();
		kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup("Acto1").setFocus();
		kSession.fireAllRules();
		*/
	}
}
