package es.deusto.ingenieria.is.search.touringproblem;
import es.deusto.ingenieria.is.search.touringproblem.formulation.EnvironmentMap;
import es.deusto.ingenieria.is.search.touringproblem.formulation.TravelingSalesmanProblem;


public class MainProgram{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Creamos un objeto TravelinSalesmanProblem para leer mediante 
		 * la clase MapReader el arcivo xml, y mediante esto podemos crear 
		 * nuestro EnviromentMap
		 */
		TravelingSalesmanProblem tsp = new TravelingSalesmanProblem();
		tsp.gatherInitialPercepts();
		
		
		/*
		 * Mostramos por pantalla que la lista de EnviromentMap recibe todas las ciudades
		 * del xml
		 */
		System.out.println(new EnvironmentMap(EnvironmentMap.cities).toString());
		
	}

}
