package test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import lugares.*;
import personajes.*;


public class TestPersonajes {

	public static void main(String[] args) {
		
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		System.out.println(kContainer.verify().getMessages().toString());
		
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		Personaje p1 = new Westley();
		Personaje p2 = new Abuelo();
		
		Lugar l1 = new Granja();
		
		kSession.insert(p1);
		kSession.insert(p2);
		
		kSession.insert(l1);
		
		kSession.fireAllRules();
	}

}
