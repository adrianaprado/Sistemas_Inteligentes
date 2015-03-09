package es.deusto.ingenieria.is.search.touringproblem.formulation;

import es.deusto.ingenieria.is.search.formulation.Operator;
import es.deusto.ingenieria.is.search.formulation.State;

public class AddCity extends Operator{

	@Override
	protected boolean isApplicable(State state) {
		// TODO Auto-generated method stub
		EnvironmentMap environment = (EnvironmentMap) state;
		return false;
	}
	
	@Override
	protected State effect(State state) {
		// TODO Auto-generated method stub
		EnvironmentMap newEnvironmentMap = (EnvironmentMap)((EnvironmentMap) state).clone();

		//Codigo del efecto que tendria el añadir una nueva ciudad a la lista
		
		/*if (newEnvironmentMap.getRobotLocation().equals(Location.LEFT)) {
			newEnvironmentMap.getLeftRoom().clean();
		} else {
			newEnvironmentMap.getRightRoom().clean();
		}*/
		
		return newEnvironmentMap;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
