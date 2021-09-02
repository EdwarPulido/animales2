/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.animals.abstrat;

/**
 *
 * @author Edwar Pulido
 * @since  29/08/2021
 * @version 
 * Clase abstracta que calsifica al animal como carnivoro
 */

public class Carnivoro {
    //atrbituos globales
    public String comida;
    
    
    
    /**
     * Constructor de la clase  carnivoro sin herbivoro
    */

    public Carnivoro() {
        this.comida = "Carne";
    }
        
    
}
