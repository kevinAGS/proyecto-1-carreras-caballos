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
public class Apostador extends Persona {

    private String numerodeapostador;
    private int numero_de_caballo;
    private Double apuesta;
    private Double apuesta_limite;

    /**
     *
     */
    public Apostador() {
        this.numerodeapostador = "No definido";
        this.numero_de_caballo = 0;
        this.apuesta = 0.0;
        this.apuesta_limite = 5000.0;

    }

    /**
     *
     * @param numerodeapostador
     * @param numero_de_caballo
     * @param apuesta
     * @param apuesta_limite
     */
    public Apostador(String numerodeapostador, int numero_de_caballo, Double apuesta, Double apuesta_limite) {
        this.numerodeapostador = numerodeapostador;
        this.numero_de_caballo = numero_de_caballo;
        this.apuesta = apuesta;
        this.apuesta_limite = apuesta_limite;
    }

    /**
     *
     * @param numerodeapostador
     * @param numero_de_caballo
     * @param apuesta
     * @param apuesta_limite
     * @param nombre
     * @param Apellidos
     * @param cedula
     * @param numero_de_telefono
     */
    public Apostador(String numerodeapostador, int numero_de_caballo, Double apuesta, Double apuesta_limite, String nombre, String Apellidos, String cedula, String numero_de_telefono) {
        super(nombre, Apellidos, cedula, numero_de_telefono);
        this.numerodeapostador = numerodeapostador;
        this.numero_de_caballo = numero_de_caballo;
        this.apuesta = apuesta;
        this.apuesta_limite = apuesta_limite;
    }

    /**
     * @return El numero de apostador
     */
    public String getNumerodeapostador() {
        return numerodeapostador;
    }

    /**
     * @param numerodeapostador El numero de apostador a establecer
     */
    public void setNumerodeapostador(String numerodeapostador) {
        this.numerodeapostador = numerodeapostador;
    }

    /**
     * @return the apuesta
     */
    public Double getApuesta() {
        return apuesta;
    }

    /**
     * @param apuesta the apuesta to set
     */
    public void setApuesta(Double apuesta) {
        this.apuesta = apuesta;
    }

    /**
     * @return the apuesta_limite
     */
    public Double getApuesta_limite() {
        return apuesta_limite;
    }

    /**
     * @param apuesta_limite the apuesta_limite to set
     */
    public void setApuesta_limite(Double apuesta_limite) {
        this.apuesta_limite = apuesta_limite;
    }

    /**
     * @return the numero_de_caballo
     */
    public int getNumero_de_caballo() {
        return numero_de_caballo;
    }

    /**
     * @param numero_de_caballo the numero_de_caballo to set
     */
    public void setNumero_de_caballo(int numero_de_caballo) {
        this.numero_de_caballo = numero_de_caballo;
    }

}
