package es.deusto.ingenieria.is.search.touringproblem.formulation;

import java.util.ArrayList;
import java.util.List;

/*
 *  Clase Ciudad con los atributos nombre y la posicion mediante x e y
 */
public class City {
	
	private String name;
	private int x;
	private int y;
	private List<City> ciudadesAccesibles = new ArrayList<City>();
	//lista ciudades para costes
	
	//metodo que lo inicialice
	
	public City(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	/*
	 * Getters and setters de los atributos de la clase
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/*
	 * Método toString que devuelve un String con los datos de la ciudad 
	 */
	public String toString(){
		return "City:"+name+" 	 x:"+x+" 	y:"+y;
	}

}
