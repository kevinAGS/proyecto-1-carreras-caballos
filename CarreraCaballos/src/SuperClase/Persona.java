/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClase;

/**
 *
 * @author DARKLESS
 */
public class Persona {
     private String nombre;
    private String apellidos;
    private String cedula;
    private String numero_de_telefono;

    /**
     * constructor sin parametros
     */
    public Persona() {
        this.nombre = "No definido";
        this.apellidos = "No definido";
        this.cedula = "No definido";
        this.numero_de_telefono = "No definido";
    }

    /**
     *
     * @param nombre
     * @param Apellidos
     * @param cedula
     * @param numero_de_telefono
     */
    public Persona(String nombre, String Apellidos, String cedula, String numero_de_telefono) {
        this.nombre = nombre;
        this.apellidos = Apellidos;
        this.cedula = cedula;
        this.numero_de_telefono = numero_de_telefono;
    }

    /**
     * @return El nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre El nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Los Apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param Apellidos Los Apellidos a establecer
     */
    public void setApellidos(String Apellidos) {
        this.apellidos = Apellidos;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula La cedula a establecer
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the numero_de_telefono
     */
    public String getNumero_de_telefono() {
        return numero_de_telefono;
    }

    /**
     * @param numero_de_telefono El numero de telefono a establecer
     */
    public void setNumero_de_telefono(String numero_de_telefono) {
        this.numero_de_telefono = numero_de_telefono;
    }
}
