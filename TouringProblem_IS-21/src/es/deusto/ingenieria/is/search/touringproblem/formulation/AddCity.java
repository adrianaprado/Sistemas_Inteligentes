package es.deusto.ingenieria.is.search.touringproblem.formulation;

import es.deusto.ingenieria.is.search.formulation.Operator;
import es.deusto.ingenieria.is.search.formulation.State;

public class AddCity extends Operator{

	private City city;
	
	public AddCity(City city) {
		this.city = city;
		
		// Donde pone el 1d, tenemos que poner el coste que supone mover esa ciudad 
		//super("Add City", 1d);
	}
	
	@Override
	protected boolean isApplicable(State state) {
		// TODO Auto-generated method stub
		EnvironmentMap environment = (EnvironmentMap) state;
		
		//Comprobación de si una ciudad está en la lista parcial de ciudades visitadas
		
		if(environment.cities.equals(city)){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	protected State effect(State state) {
		// TODO Auto-generated method stub
		EnvironmentMap newEnvironmentMap = (EnvironmentMap)((EnvironmentMap) state).clone();

		//Codigo del efecto que tendria el añadir una nueva ciudad a la lista
		
		/*if(environment.cities.equals(city)){
			return true;
		}else{
			return false;
		}*/
		
		return newEnvironmentMap;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
