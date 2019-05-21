/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Carrera.Carrera;
import ClasesHijas.Apostador;
import ClasesHijas.Propietario;
import java.util.ArrayList;

/**
 *
 * @author DARKLESS
 */
public class CasaApuestas {

    /**
     * @param apostador
     * @param Datos
     * @param nueva
     * @throws InterruptedException
     */
    public static void ganadoresPerdedores(ArrayList<Apostador> apostador, ArrayList<Propietario> Datos, Pista nueva) throws InterruptedException {
        String carrera = Carrera(nueva);
        //System.out.println(carrera);
        char gana = carrera.charAt(3);
        int ganador = Integer.parseInt(String.valueOf(gana));
        for (int i = 0; i < apostador.size(); i++) {
            if (apostador.get(i).getNumero_de_caballo() == ganador) {
                System.out.println("\n\033[32m********************************************************************************************|  |");
                System.out.printf("El apostador " + apostador.get(i).getNombre() + " Ha ganado al apostarle al caballo numero " + apostador.get(i).getNumero_de_caballo());
                System.out.println("");
                System.out.printf("Su apuesta de " + apostador.get(i).getApuesta() + " sera duplicada... ahora su dinero es de :");
                apostador.get(i).setApuesta(apostador.get(i).getApuesta() * 2);

                System.out.print(apostador.get(i).getApuesta());
                System.out.println("\nEl Propietario " + Datos.get(i).getNombre() + " " + Datos.get(i).getApellidos() + " se le dara una bonificacion por el gane de su caballo " + Datos.get(i).getCaballo().getNombre());
                Datos.get(i).setGanancia(250);
                System.out.println("");
                System.out.println("La bonificacion es de " + Datos.get(i).getGanancia());
                System.out.println("\n\033[32m********************************************************************************************|  |");

            } else if (apostador.get(i).getNumero_de_caballo() != ganador) { //Si pierde
                System.out.println("El apostador " + apostador.get(i).getNombre() + " Ha perdido: " + apostador.get(i).getApuesta() + " al apostarle al caballo numero " + apostador.get(i).getNumero_de_caballo());
                System.out.println("");

            }
        }
    }

}
