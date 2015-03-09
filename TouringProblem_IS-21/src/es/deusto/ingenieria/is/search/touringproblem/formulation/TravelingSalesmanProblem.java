package es.deusto.ingenieria.is.search.touringproblem.formulation;

import es.deusto.ingenieria.is.search.formulation.Problem;
import es.deusto.ingenieria.is.search.formulation.State;
import es.deusto.ingenieria.is.search.xml.StateXMLReader;

public class TravelingSalesmanProblem extends Problem {
	
	//Constructor del problema del tour problem
	public TravelingSalesmanProblem() {
		super();
		this.isFinalState();
		this.createOperators();
	}

	/*
	 * Metodo que crea un nuevo objeto MapReader que envia
	 * por paramentro el archivo xml que vamos a leer
	 * y devuelve el estado que crea un EnviromentMap
	 */
	public State gatherInitialPercepts() {
		StateXMLReader stateXMLReader = new MapReader("data/tourProblem1.xml"); 								
		return stateXMLReader.getState();
	}	
	
	private void isFinalState(){
		//this.addFinalState(new Environment();
	}
	
	private void createOperators(){
		this.addOperator(new AddCity());
		this.addOperator(new MoveTo());
	}
		
	public static void main (String[]args){
		//ejemplo para probar que el gatherInitialPercepts funciona
		
	}
	
}
