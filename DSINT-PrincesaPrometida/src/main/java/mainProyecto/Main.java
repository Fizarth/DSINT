package mainProyecto;

import java.io.IOException;
import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import utilidades.Acto;
import utilidades.Archivo;
import utilidades.Consulta;
import utilidades.ConsultaQue;
import utilidades.ConsultaQuien;
import utilidades.Parser;

public class Main {

	private static final KieServices ks = KieServices.Factory.get();
	private static final KieContainer kContainer = ks.getKieClasspathContainer();
	private static KieSession kSession = kContainer.newKieSession("ksession-rules");

	public static void main(String[] args) {

		// System.out.println(kContainer.verify().getMessages().toString());

		String filePath = "/home/norberto/Downloads/input1.txt";
		Archivo.setPath(filePath + ".output");

		ArrayList<Consulta> consultas = null;
		try {
			consultas = (ArrayList<Consulta>) Parser.parsear(filePath);
		} catch (IOException e) {
			System.err.println("No se ha podido leer el fichero: " + filePath);
			System.exit(-1);
		}

		for (Consulta consulta : consultas) {
			// Init Session
			kSession.fireAllRules();
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
			resetSession();

		}

		try {
			Archivo.getUnicaInstancia().cerrarArchivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void ejecutarHastaActo(Acto acto) {
		for (int i = 0; i <= acto.getNumActo(); i++) {
			kSession.getAgenda().getAgendaGroup("Acto" + i).setFocus();
			kSession.fireAllRules();
		}
	}

	private static void resetSession() {
		kSession.destroy();
		kSession = kContainer.newKieSession("ksession-rules");
	}

}
