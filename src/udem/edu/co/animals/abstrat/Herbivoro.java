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
 * Clase abstracta que clasifican al animal como herbivoro
 */

public class Herbivoro {
    //atrbituos globales
    public String comida;
    
    
    
    /**
     * Constructor de la clase Herbivoro sin carnivoro
    */

    public Herbivoro() {
        this.comida = "Plantas";
    }
}
