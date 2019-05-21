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
public class Propietario extends Persona {

    private String equipo;
    private Caballo caballo;
    private double ganancia;

    /**
     *
     *
     */
    public Propietario() {
        this.equipo = "No definido";
        this.caballo = new Caballo();
        this.ganancia = 0.0;
    }

    /**
     *
     * @param equipo
     * @param caballo
     * @param ganancia
     *
     */
    public Propietario(String equipo, Caballo caballo, double ganancia) {
        this.equipo = equipo;
        this.caballo = caballo;
        this.ganancia = ganancia;
    }

    /**
     *
     * @param Equipo
     * @param caballo
     * @param ganancia
     * @param nombre
     * @param Apellidos
     * @param cedula
     * @param numero_de_telefono
     */
    public Propietario(String Equipo, Caballo caballo, double ganancia, String nombre, String Apellidos, String cedula, String numero_de_telefono) {
        super(nombre, Apellidos, cedula, numero_de_telefono);
        this.equipo = Equipo;
        this.caballo = caballo;
        this.ganancia = ganancia;
    }

    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the caballo
     */
    public Caballo getCaballo() {
        return caballo;
    }

    /**
     * @param caballo the caballo to set
     */
    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }

    /**
     * @return the ganancia
     */
    public double getGanancia() {
        return ganancia;
    }

    /**
     * @param ganancia the ganancia to set
     */
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

}
