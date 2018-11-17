package test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import lugares.*;
import profesiones.*;
import personajes.*;

public class TestPersonajes {

	public static void main(String[] args) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		System.out.println(kContainer.verify().getMessages().toString());

		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		// Lugar l1 = new AcantiladosLocura();
		// Lugar l2 = new Bosque();
		// Lugar l3 = new BosqueLadrones();
		// Lugar l4 = new CaminoMontana();
		// Lugar l5 = new CasaMilagrosoMax();
		 Lugar l6 = new Castillo();
		// Lugar l7 = new Espana();
		Lugar l8 = new Granja();
		Lugar l9 = new HabitacionNino();
		Lugar l10 = new Mar();
		// Lugar l11 = new PantanoFuego();
		// Lugar l12 = new PozoDesesperacion();

		// kSession.insert(l1);
		// kSession.insert(l2);
		// kSession.insert(l3);
		// kSession.insert(l4);
		// kSession.insert(l5);
		 kSession.insert(l6);
		// kSession.insert(l7);
		kSession.insert(l8);
		kSession.insert(l9);
		kSession.insert(l10);
		// kSession.insert(l11);
		// kSession.insert(l2);

		Profesion t1 = new Granjero();
		Profesion t2 = new Pirateria();
		Profesion t3 = new Gobernante();
		kSession.insert(t1);
		kSession.insert(t2);
		kSession.insert(t3);
		
		
		Personaje p1 = new Abuelo(l9);
		// Personaje p2 = new Albino();
		// Personaje p3 = new Anciana();
		Personaje p4 = new Buttercup(t1, l8);
		// Personaje p5 = new Conde();
		// Personaje p6 = new Fezzik();
		// Personaje p7 = new Inigo();
		Personaje p8 = new Madre(l9);
		// Personaje p9 = new Max();
		Personaje p10 = new Nieto(l9);
		// Personaje p11 = new Obispo();
		// Personaje p12 = new PadreInigo();
		Personaje p13 = new Pirata(t2,l10);
		// Personaje p14 = new Principe();
		Personaje p15 = new Rey(t3,l6);
		// Personaje p16 = new Valerie();
		// Personaje p17 = new Vizzini();
		Personaje p18 = new Westley(t1, l8);
		// Personaje p19 = new Yalin();

		kSession.insert(p1);
		// kSession.insert(p2);
		// kSession.insert(p3);
		kSession.insert(p4);
		// kSession.insert(p5);
		// kSession.insert(p6);
		// kSession.insert(p7);
		kSession.insert(p8);
		// kSession.insert(p9);
		kSession.insert(p10);
		// kSession.insert(p11);
		// kSession.insert(p12);
		kSession.insert(p13);
		// kSession.insert(p14);
		kSession.insert(p15);
		// kSession.insert(p16);
		// kSession.insert(p17);
		kSession.insert(p18);
		// kSession.insert(p19);

		kSession.fireAllRules();
	}

}
