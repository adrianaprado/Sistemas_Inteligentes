package formulation;

import es.deusto.ingenieria.is.search.formulation.Problem;
import es.deusto.ingenieria.is.search.formulation.State;
import es.deusto.ingenieria.is.search.xml.StateXMLReader;

public class TravelingSalesmanProblem extends Problem {

	/*
	 * Metodo que crea un nuevo objeto MapReader que envia
	 * por paramentro el archivo xml que vamos a leer
	 * y devuelve el estado que crea un EnviromentMap
	 */
	public State gatherInitialPercepts() {
		StateXMLReader stateXMLReader = new MapReader("data/tourProblem1.xml"); 								
		return stateXMLReader.getState();
	}	
	
}
