/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co;

import udem.edu.co.animals.Conejo;
import udem.edu.co.animals.Gato;
import java.util.ArrayList;
import java.util.List;
import udem.edu.co.animals.Perro;
import udem.edu.co.animals.interfaces.Animal;

/**
 *
 * @author mery2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Perro());
                animals.add(new Perro());
		animals.add(new Gato());
		animals.add(new Conejo());//
		for(Animal animal:animals) {
			System.out.println(animal.toString());
		}
		
	}
}
