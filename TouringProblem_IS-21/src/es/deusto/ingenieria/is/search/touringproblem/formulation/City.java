package es.deusto.ingenieria.is.search.touringproblem.formulation;

import java.util.ArrayList;
import java.util.List;

/*
 *  Clase Ciudad con los atributos nombre, lista de ciudades accesibles y la posicion mediante x e y
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
	 * Metodo toString que devuelve un String con los datos de la ciudad 
	 */
	public String toString(){
		return "City:"+name+" 	 x:"+x+" 	y:"+y;
	}
	
	//Metodo equals para comparar ciudades
	public boolean equals(Object obj){
		if(obj != null && obj instanceof City && ((City)obj).name.equals(this.name)
				&& ((City)obj).x == this.x && ((City)obj).y == this.y)
			return true;
		else{
			return false;
		}
	}
	
	public Object clone() {
		Object clon = null;
		
		try {
			clon = super.clone();			
		} catch (CloneNotSupportedException e) {
			System.err.println("% [ERROR] Room.clone(): " + e.getMessage());
		}
		
		return clon;		
	}

}
