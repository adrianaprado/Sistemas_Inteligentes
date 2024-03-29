package es.deusto.ingenieria.is.search.touringproblem.formulation;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import es.deusto.ingenieria.is.search.formulation.State;
import es.deusto.ingenieria.is.search.xml.StateXMLReader;

public class MapReader extends StateXMLReader{

	/*
	 * Atributos para almacenar los datos del xml
	 */
	private String name;
	@SuppressWarnings("unused")
	private int x,y,cities;
	private static List<City> lcities =  new ArrayList<City>();
	
	/*
	 * Constructor de la clase que recibe el archivo xml
	 */
	public MapReader(String xmlFile) {
		super(xmlFile);
	}
	
	/*
	 * Metodo startElement que extrae del xml los datos de las ciudades 
	 * y los puntos de inicio y final para luego almacenarlos 
	 * en una lista de tipo City
	 */
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		try {			
			if (qName.equals("is:map")) {
				this.cities = Integer.parseInt(attributes.getValue("cities"));
			} else if (qName.equals("is:city") || qName.equals("is:start") || qName.equals("is:end")) {
				this.name = attributes.getValue("name");
				this.x = Integer.parseInt(attributes.getValue("x"));
				this.y = Integer.parseInt(attributes.getValue("y"));
				lcities.add(new City(name,x,y));
			}
		} catch (Exception ex) {
			System.out.println(this.getClass().getName() + ".startElement(): " + ex);
		}
	}


	/*
	 * Metodo que devuelve un nuevo objeto EnviromentMap con la lista de ciudades
	 * que hemos adquerido del xml
	 */
	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return new EnvironmentMap(lcities);
	}
}
