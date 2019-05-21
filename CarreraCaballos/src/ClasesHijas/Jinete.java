/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesHijas;

import SuperClase.Persona;

/**
 *
 * @author DARKLESS
 */
public class Jinete extends Persona {
    private String numero_de_caballo;
    private String peso_jinete;

    /**
     *
     */
    public Jinete() {
        this.numero_de_caballo = "No definido";
        this.peso_jinete = "No definido";
    }

    /**
     *
     * @param numero_de_caballo
     * @param peso_jinete
     */
    public Jinete(String numero_de_caballo, String peso_jinete) {
        this.numero_de_caballo = numero_de_caballo;
        this.peso_jinete = peso_jinete;
    }

    /**
     *
     * @param numero_de_caballo
     * @param peso_jinete
     * @param nombre
     * @param Apellidos
     * @param cedula
     * @param numero_de_telefono
     */
    public Jinete(String numero_de_caballo, String peso_jinete, String nombre, String Apellidos, String cedula, String numero_de_telefono) {
        super(nombre, Apellidos, cedula, numero_de_telefono);
        this.numero_de_caballo = numero_de_caballo;
        this.peso_jinete = peso_jinete;
    }

    /**
     * @return the numero_de_caballo
     */
    public String getNumero_de_caballo() {
        return numero_de_caballo;
    }

    /**
     * @param numero_de_caballo the numero_de_caballo to set
     */
    public void setNumero_de_caballo(String numero_de_caballo) {
        this.numero_de_caballo = numero_de_caballo;
    }

    /**
     * @return the peso_jinete
     */
    public String getPeso_jinete() {
        return peso_jinete;
    }

    /**
     * @param peso_jinete the peso_jinete to set
     */
    public void setPeso_jinete(String peso_jinete) {
        this.peso_jinete = peso_jinete;
    }
    
}
