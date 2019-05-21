/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static ClasesHijas.Empleado.Menu;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DARKLESS
 */
public class Carrera {

    private static String opc = "0";

    /**
     *
     * @throws IOException
     */
    public static void menu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String startDir = System.getProperty("user.dir")+"\\datos_carrera";
        System.out.println("directorio "+startDir);
        //COLORES PARA ELEGIR
        String negro = "\033[30m";
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String amarillo = "\033[33m";
        String azul = "\033[34m";
        String magenta = "\033[35m";
        String cyan = "\033[36m";
        String blanco = "\033[37m";

        System.out.println(verde + "*||===================================||*");
        System.out.println(verde + "*||           /(--                    ||*");
        System.out.println(verde + "*||      ,---' /`-'    BIENVENIDOS    ||*");
        System.out.println(verde + "*||     /( )__))                      ||*");
        System.out.println(verde + "*||  _ /_//___\\ __                   ||*");
        System.out.println(verde + "*||      ``    ``          A LA       ||*");
        System.out.println(verde + "*||                                   ||.");
        System.out.println(verde + "*||       GRAN CARRERA DE CABALLOS    ||.");
        System.out.println(verde + "*||===================================||.");

        while (opc.equals("0")) {
            System.out.println("Digite 1 para continuar");
            System.out.println("");
            opc = sc.nextLine();
            System.out.println("");
            System.out.println("");
            if (opc.equals("1")) {
                try {
                    Menu();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (!opc.equals("1")) {
                System.out.println("Error...Solo opcion 1 para continuar");
                System.out.println("");
                opc = "0";
            }
        }
    }

    /**
     *
     * @param nueva
     * @return
     * @throws InterruptedException
     */
    public static String Carrera(Pista nueva) throws InterruptedException {
        String uno = "\033[30m        ,,\n\033[30m       /(-\\\n\033[30m  ,---' /`-'\n\033[30m /( )__))\n\033[30m/ //   \\\\\n\033[30m  ``    ``";
        String dos = "";
        String tres = "";
        String cuatro = "";
        String cinco = "";
        String b = "     ";
        int a = 0;
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        String x11 = b;
        String x22 = b;
        String x33 = b;
        String x44 = b;
        String x55 = b;
        String[][] matriz = new String[nueva.getCantidad_de_caballos()][20];
        String resultados[] = new String[matriz.length];
        int p = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][0] = uno;
                if (matriz[i][j] == null) {
                    matriz[i][j] = b;
                }
            }
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\033[32m********************************************************************************************|  |");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("\n\033[32m********************************************************************************************|  |");
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        int contador = 0;
        boolean siga = true;
        while (siga) {
            a = (int) (Math.random() * (0 - matriz.length) + matriz.length);
            if (a == 0) {
                if (x1 < matriz[0].length - 1) {
                    uno = "\033[30m        ,,\n" + x11 + "\033[30m       /(-\\\n" + x11 + "\033[30m  ,---' /`-'\n" + x11 + "\033[30m /( )__))\n" + x11 + "\033[30m/ //   \\\\\n" + x11 + "\033[30m  ``    ``";
                    matriz[a][x1] = b;
                    x1++;
                    matriz[a][x1] = uno;
                    if (x1 <= matriz[0].length - 1) {
                        x11 += b;
                    }
                }
            }
            if (a == 1) {
                if (x2 < matriz[0].length - 1) {
                    dos = "\033[34m        ,,\n" + x22 + "\033[34m       /(-\\\n" + x22 + "\033[34m  ,---' /`-'\n" + x22 + "\033[34m /( )__))\n" + x22 + "\033[34m/ //   \\\\\n" + x22 + "\033[34m  ``    ``";
                    matriz[a][x2] = b;
                    x2++;
                    matriz[a][x2] = dos;
                    if (x2 <= matriz[0].length - 1) {
                        x22 += b;
                    }
                }
            }
            if (a == 2) {
                if (x3 < matriz[0].length - 1) {
                    tres = "\033[33m        ,,\n" + x33 + "\033[33m       /(-\\\n" + x33 + "\033[33m  ,---' /`-'\n" + x33 + "\033[33m /( )__))\n" + x33 + "\033[33m/ //   \\\\\n" + x33 + "\033[33m  ``    ``";
                    matriz[a][x3] = b;
                    x3++;
                    matriz[a][x3] = tres;
                    if (x3 <= matriz[0].length - 1) {
                        x33 += b;
                    }
                }
            }
            if (a == 3) {
                cuatro = "\033[31m        ,,\n" + x44 + "\033[31m       /(-\\\n" + x44 + "\033[31m  ,---' /`-'\n" + x44 + "\033[31m /( )__))\n" + x44 + "\033[31m/ //   \\\\\n" + x44 + "\033[31m  ``    ``";
                if (x4 < matriz[0].length - 1) {
                    matriz[a][x4] = b;
                    x4++;
                    matriz[a][x4] = cuatro;

                    if (x4 <= matriz[0].length - 1) {
                        x44 += b;
                    }

                }
            }
            if (a == 4) {
                cinco = "\033[36m        ,,\n" + x55 + "\033[36m       /(-\\\n" + x55 + "\033[36m  ,---' /`-'\n" + x55 + "\033[36m /( )__))\n" + x55 + "\033[36m/ //   \\\\\n" + x55 + "\033[36m  ``    ``";
                if (x5 < matriz[0].length - 1) {
                    matriz[a][x5] = b;
                    x5++;
                    matriz[a][x5] = cinco;

                    if (x5 <= matriz[0].length - 1) {
                        x55 += b;
                    }

                }
            }
            Thread.sleep(125);
            System.out.println("\n\033[32m********************************************************************************************|  |");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println("\n\033[32m********************************************************************************************|  |");
            }

            Thread.sleep(125);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if (x1 == matriz[0].length - 1 && resultados[p] == null) {
                resultados[p] = "El 1 de " + String.valueOf(p + 1);
                p++;
                x1++;
            }
            if (x2 == matriz[0].length - 1 && resultados[p] == null) {
                resultados[p] = "El 2 de " + String.valueOf(p + 1);
                p++;
                x2++;
            }
            if (x3 == matriz[0].length - 1 && resultados[p] == null) {
                resultados[p] = "El 3 de " + String.valueOf(p + 1);
                p++;
                x3++;
            }
            if (x4 == matriz[0].length - 1 && resultados[p] == null) {
                resultados[p] = "El 4 de " + String.valueOf(p + 1);
                p++;
                x4++;
            }
            if (x5 == matriz[0].length - 1 && resultados[p] == null) {
                resultados[p] = "El 5 de " + String.valueOf(p + 1);
                p++;
                x5++;

            }
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][matriz[0].length - 1] == b) {
                    contador++;
                }
            }
            if (contador <= matriz.length && contador >= 0) {
                siga = true;
            } else {
                siga = false;
            }
            contador = -1;

        }

        return resultados[0];

    }

}
