/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.animals;

import udem.edu.co.animals.abstrat.Carnivoro;
import udem.edu.co.animals.interfaces.Animal;

/**
 *
 * @author mery2
 */
public class Gato extends Carnivoro implements Animal {
    
//atributos globales
	private int legs;
	private String color;

	/**
	 *
	 * Constructor de la clase 
	*/
	public Gato() {
		this(4,"sin definir");
	}

	/**
	 * Constructor de la clase
	 * @param legs
	 *       cantidad de patas del gatos
	 * @param color
	 *       color del gato
	 */
	public Gato(int legs, String color) {
		super();
		this.legs = legs;
		this.color = color;
	}

	/**
	 * Metodo obligado por la interfaz para diferenciar al animal
	 */
	@Override
	public void desplazar() {
		// TODO Auto-generated method stub
		
	}


	//getters and setters
 
	/**
	 * @return the legs
	 */
	public int getLegs() {
		return legs;
	}

	/**
	 * @param legs the legs to set
	 */
	public void setLegs(int legs) {
		this.legs = legs;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "yo tengo un gato que tiene "+ this.getLegs()+" patas, es de color "+this.getColor()+" le gusta comer "+super.comida+" y es mi favorito en todo el mundo";
	}
}
