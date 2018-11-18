package test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import lugares.*;
import personajes.*;

public class TestRelacion {

	public static void main(String[] args) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		System.out.println(kContainer.verify().getMessages().toString());

		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		Lugar hab = new HabitacionN();
		
		kSession.insert(hab);	
		
		Personaje a = new Abuelo(hab);
		Personaje m = new Madre(hab);
		Personaje n = new Nieto(hab);
		
		kSession.insert(a);
		kSession.insert(m);
		kSession.insert(n);

		kSession.fireAllRules();
	}

}