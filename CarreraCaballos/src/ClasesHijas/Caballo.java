/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesHijas;

import ClasesHijas.Jinete;


/**
 *
 * @author DARKLESS
 */
import Clases.Animal;

/**
 *
 * @author DARKLESS
 */
public class Caballo extends Animal {
   
    private String raza_de_caballo;
    private String color;
    private Jinete jinete;

    /**
     *
     */
    public Caballo() {
      super();
        this.raza_de_caballo = "No definido";
        this.color = "No definido";
        this.jinete = new Jinete();
    }

    /**
     *
     * @param nombre
     * @param raza_de_caballo
     * @param color
     * @param jinete
     */

    public Caballo(String nombre, String raza_de_caballo, String color, Jinete jinete) {
        super();
        this.raza_de_caballo = raza_de_caballo;
        this.color = color;
        this.jinete = jinete;
    }

    /**
     *
     * @param nombre
     * @param raza_de_caballo
     * @param color
     * @param jinete
     * @param ganaderia
     * @param caballo
     */
    public Caballo(String nombre, String raza_de_caballo, String color, Jinete jinete, String ganaderia, Caballo caballo) {
       
        this.raza_de_caballo = raza_de_caballo;
        this.color = color;
        this.jinete = jinete;
    }

    /**
     * @return El nombre
     */
 
    /**
     * @return La raza del caballo
     */
    public String getRaza_de_caballo() {
        return raza_de_caballo;
    }

    /**
     * @param raza_de_caballo La raza de caballo a establecer
     */
    public void setRaza_de_caballo(String raza_de_caballo) {
        this.raza_de_caballo = raza_de_caballo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color El color a establecer
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the jinete
     */
    public Jinete getJinete() {
        return jinete;
    }

    /**
     * @param jinete El jinete a establecer
     */
    public void setJinete(Jinete jinete) {
        this.jinete = jinete;
    }
    
}
