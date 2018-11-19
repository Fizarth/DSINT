package test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import utilidades.Acto;
import utilidades.ConsultaQue;
import utilidades.ConsultaQuien;

public class TestActo1 {

	public static void main(String[] args) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		//System.out.println(kContainer.verify().getMessages().toString());

		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		kSession.fireAllRules();
		/*kSession.getAgenda().getAgendaGroup("Acto0").setFocus();
		kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup("Acto1").setFocus();
		kSession.fireAllRules();*/
		Acto ac = Acto.Acto1;
		ConsultaQuien cq = new ConsultaQuien("La Madre", ac);
		for(int i = 0; i < ac.getNumActo(); i++){
			kSession.getAgenda().getAgendaGroup("Acto"+i).setFocus();
			kSession.fireAllRules();
		}
		kSession.insert(cq);
		kSession.fireAllRules();
	}
}
