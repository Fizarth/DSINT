package test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import personajes.*;


public class TestPersonajes {

	public static void main(String[] args) {
		
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		System.out.println(kContainer.verify().getMessages().toString());
		
		KieSession kSession = kContainer.newKieSession("ksession-rules-dsi");
		
		Personaje p1 = new Nieto();
		Personaje p2 = new Abuelo();
		
		kSession.insert(p1);
		kSession.insert(p2);
		
		kSession.fireAllRules();
	}

}
