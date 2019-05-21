/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author DARKLESS
 */
public class Pista {

    private int cantidad_de_caballos;
    private double distancia_de_la_pista;

    /**
     *
     */
    public Pista() {
        this.cantidad_de_caballos = 0;
        this.distancia_de_la_pista = 500.0;
    }

    /**
     *
     * @param cantidad_de_caballos
     * @param distancia_de_la_pista
     */
    public Pista(int cantidad_de_caballos, double distancia_de_la_pista) {
        this.cantidad_de_caballos = cantidad_de_caballos;
        this.distancia_de_la_pista = distancia_de_la_pista;
    }

    /**
     * @return the cantidad_de_caballos
     */
    public int getCantidad_de_caballos() {
        return cantidad_de_caballos;
    }

    /**
     * @param cantidad_de_caballos La cantidad de caballos a establecer
     */
    public void setCantidad_de_caballos(int cantidad_de_caballos) {
        this.cantidad_de_caballos = cantidad_de_caballos;
    }

    /**
     * @return the distancia_de_la_pista
     */
    public double getDistancia_de_la_pista() {
        return distancia_de_la_pista;
    }

    /**
     * @param distancia_de_la_pista La distancia de la pista a establecer
     */
    public void setDistancia_de_la_pista(double distancia_de_la_pista) {
        this.distancia_de_la_pista = distancia_de_la_pista;
    }

}
