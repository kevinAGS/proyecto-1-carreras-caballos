/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesHijas;

import Clases.Carrera;
import Clases.CasaApuestas;
import Clases.Pista;
import SuperClase.Persona;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DARKLESS
 */
public class Empleado extends Persona {

    String ID;
    
   
    public Empleado() {
    }

    public Empleado(String ID) {
        this.ID = ID;
    }

    /**
     *
     * @param ID
     * @param nombre
     * @param Apellidos
     * @param cedula
     * @param numero_de_telefono
     */
    public Empleado(String ID, String nombre, String Apellidos, String cedula, String numero_de_telefono) {
        super(nombre, Apellidos, cedula, numero_de_telefono);
        this.ID = ID;
    }

    /**
     *
     * @throws IOException
     * @throws InterruptedException
     */
    public static void Menu() throws IOException, InterruptedException {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("+------------------------------------+");
        System.out.println("|                                    |");
        System.out.println("|          **MENU PRINCIPAL**        |");
        System.out.println("|                                    |");
        System.out.println("|____________________________________|");
        System.out.println("|                                    |");
        System.out.println("|  -->  Digite [1] Apostar y jugar   |");
        System.out.println("|                                    |");
        System.out.println("|  -->  Digite [2] Ver Anteriores    |");
        System.out.println("|                                    |");
        System.out.println("|  -->  Digite [3] Salir...          |");
        System.out.println("|____________________________________|");
        System.out.println("                                      ");

        String me;
        me = sc.nextLine();
        System.out.println("");
        switch (me) {
            case "1":
                rondas();

            case "2":
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("**************************************");
                ExtraerDatos();
                System.out.println("**************************************");
                System.out.println("Digite 5 para continuar ");
                System.out.println("Ingrese cualquier tecla para salir");
                String x;
                x = sc.nextLine();

                switch (x) {
                    case "5":
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        Menu();

                    default:
                        break;
                }
            case "3":
                System.exit(0);

            default:
                System.out.println("Digite una opcion valida");
                Menu();
        }
    }

    /**
     *
     * @throws IOException
     * @throws InterruptedException
     */
    public static void propietarios() throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pista nueva = new Pista();
        System.out.println("Ingrese cantidad de Caballos, minimo 3, maximo 5");
        int caballos = 0;
        while (caballos != 3 && caballos != 4 && caballos != 5) {
            try {
                caballos = Integer.parseInt(br.readLine());
            } catch (NumberFormatException ex) {
                caballos = 0;
            }
            if (caballos < 3 || caballos > 5) {
                System.out.println("Cantidad incorrecta, Ingrese nuevamente");
            }
        }
        nueva.setCantidad_de_caballos(caballos);
        Propietario propi = new Propietario();
        ArrayList<Propietario> Datos = new ArrayList<>();
        propi.setNombre("JOSÉ");
        propi.setApellidos("VILLAREAL CRUZ");
        propi.setCedula("60450643");
        propi.setNumero_de_telefono("84256426");
        propi.setEquipo("TRIPLE EQUIS ");
        propi.getCaballo().setNombre("TORNADO");
        propi.getCaballo().setColor("NEGRO");
        propi.getCaballo().setRaza_de_caballo("CARSON");
        propi.getCaballo().getJinete().setNombre("JULIO");
        propi.getCaballo().getJinete().setApellidos("CASTRO GUIDO");
        propi.getCaballo().getJinete().setCedula("116540767");
        propi.getCaballo().getJinete().setNumero_de_telefono("84345276");
        propi.getCaballo().getJinete().setPeso_jinete("62");
        propi.getCaballo().getJinete().setNumero_de_caballo("1");
        Datos.add(propi);
        propi = new Propietario();
        propi.setNombre("VICENTE");
        propi.setApellidos("FERNANDEZ AGUILAR");
        propi.setCedula("60125045");
        propi.setNumero_de_telefono("87646426");
        propi.setEquipo("LA PENCA");
        propi.getCaballo().setNombre("PETARDO");
        propi.getCaballo().setColor("NEGRO");
        propi.getCaballo().setRaza_de_caballo("MUSTANG");
        propi.getCaballo().getJinete().setNombre("WILBERTH");
        propi.getCaballo().getJinete().setApellidos("GRANADOS PADILLA");
        propi.getCaballo().getJinete().setCedula("53865297");
        propi.getCaballo().getJinete().setNumero_de_telefono("52456878");
        propi.getCaballo().getJinete().setPeso_jinete("74");
        propi.getCaballo().getJinete().setNumero_de_caballo("2");
        Datos.add(propi);

        propi = new Propietario();
        propi.setNombre("LUIS");
        propi.setApellidos("ULLOA ZAMBRANA");
        propi.setCedula("110210123");
        propi.setNumero_de_telefono("1231426");
        propi.setEquipo("LA VICTORIA");
        propi.getCaballo().setNombre("FASTER");
        propi.getCaballo().setColor("AZUL");
        propi.getCaballo().setRaza_de_caballo("PECHERON");
        propi.getCaballo().getJinete().setNombre("RAUL");
        propi.getCaballo().getJinete().setApellidos("SOTO JIMENEZ");
        propi.getCaballo().getJinete().setCedula("783527145");
        propi.getCaballo().getJinete().setNumero_de_telefono("587443651");
        propi.getCaballo().getJinete().setPeso_jinete("67");
        propi.getCaballo().getJinete().setNumero_de_caballo("3");
        Datos.add(propi);

        propi = new Propietario();
        propi.setNombre("LUCAS");
        propi.setApellidos("SIBAJA PEREZ");
        propi.setCedula("405761364");
        propi.setNumero_de_telefono("56457896");
        propi.setEquipo("EL HIGUERÓN");
        propi.getCaballo().setNombre("VOLT");
        propi.getCaballo().setColor("CAFÉ");
        propi.getCaballo().setRaza_de_caballo("PURASANGRE");
        propi.getCaballo().getJinete().setNombre("JOHN");
        propi.getCaballo().getJinete().setApellidos("TEJEDA DIAZ");
        propi.getCaballo().getJinete().setCedula("985547253");
        propi.getCaballo().getJinete().setNumero_de_telefono("68413547");
        propi.getCaballo().getJinete().setPeso_jinete("58");
        propi.getCaballo().getJinete().setNumero_de_caballo("4");
        Datos.add(propi);

        propi = new Propietario();

        propi.setNombre("ERNESTO");
        propi.setApellidos("RAMIREZ AGUIRRE");
        propi.setCedula("604350418");
        propi.setNumero_de_telefono("84227806");
        propi.setEquipo("EL COLORADO");
        propi.getCaballo().setNombre("SPIRIT");
        propi.getCaballo().setColor("BLANCO");
        propi.getCaballo().setRaza_de_caballo("MUSTANG");
        propi.getCaballo().getJinete().setNombre("RICK");
        propi.getCaballo().getJinete().setApellidos("SANCHEZ VILLAREAL");
        propi.getCaballo().getJinete().setCedula("64576863");
        propi.getCaballo().getJinete().setNumero_de_telefono("83544153");
        propi.getCaballo().getJinete().setPeso_jinete("70");
        propi.getCaballo().getJinete().setNumero_de_caballo("5");
        Datos.add(propi);

        String azul = "\033[34m";
        System.out.println("===========================================================================================================================================");
        System.out.println(azul + "||INFORMACION DE LOS EQUIPOS A COMPETIR:                                                                                                ||");
        System.out.println("===========================================================================================================================================");
        System.out.println(azul + "|| Numero de || Apodo del || Color del ||  Raza de   ||   EQUIPO      ||       Propietario     ||          Jinete        ||    Peso del   ||\n" + azul + "||  caballo  ||  caballo  ||  caballo  ||   caballo  ||              ||                       ||                        ||     Jinete    ||");
        System.out.println("===========================================================================================================================================");
        System.out.println(azul + "||     " + Datos.get(0).getCaballo().getJinete().getNumero_de_caballo() + "     || " + Datos.get(0).getCaballo().getNombre() + "  || " + Datos.get(0).getCaballo().getColor() + " ||   " + Datos.get(0).getCaballo().getRaza_de_caballo() + "    || " + Datos.get(0).getEquipo() + " || " + Datos.get(0).getNombre() + " " + Datos.get(0).getApellidos() + "    || " + Datos.get(0).getCaballo().getJinete().getNombre() + " " + Datos.get(0).getCaballo().getJinete().getApellidos() + "    || " + Datos.get(0).getCaballo().getJinete().getPeso_jinete() + " Kilogramos ||");
        System.out.println("===========================================================================================================================================");
        System.out.println(azul + "||     " + Datos.get(1).getCaballo().getJinete().getNumero_de_caballo() + "     || " + Datos.get(1).getCaballo().getNombre() + "    ||   " + Datos.get(1).getCaballo().getColor() + "    ||  " + Datos.get(1).getCaballo().getRaza_de_caballo() + "   || " + Datos.get(1).getEquipo() + "    || " + Datos.get(1).getNombre() + " " + Datos.get(1).getApellidos() + "      || " + Datos.get(1).getCaballo().getJinete().getNombre() + " " + Datos.get(1).getCaballo().getJinete().getApellidos() + "  || " + Datos.get(1).getCaballo().getJinete().getPeso_jinete() + " Kilogramos ||");
        System.out.println("===========================================================================================================================================");
        System.out.println(azul + "||     " + Datos.get(2).getCaballo().getJinete().getNumero_de_caballo() + "     || " + Datos.get(2).getCaballo().getNombre() + "    || " + Datos.get(2).getCaballo().getColor() + " ||  " + Datos.get(2).getCaballo().getRaza_de_caballo() + "  || " + Datos.get(2).getEquipo() + "   || " + Datos.get(2).getNombre() + " " + Datos.get(2).getApellidos() + "      || " + Datos.get(2).getCaballo().getJinete().getNombre() + " " + Datos.get(2).getCaballo().getJinete().getApellidos() + " || " + Datos.get(2).getCaballo().getJinete().getPeso_jinete() + " Kilogramos ||");
        System.out.println("===========================================================================================================================================");
        if (nueva.getCantidad_de_caballos() >= 4) {
            System.out.println(azul + "||     " + Datos.get(3).getCaballo().getJinete().getNumero_de_caballo() + "     || " + Datos.get(3).getCaballo().getNombre() + "      ||   " + Datos.get(3).getCaballo().getColor() + "    || " + Datos.get(3).getCaballo().getRaza_de_caballo() + " || " + Datos.get(3).getEquipo() + "  || " + Datos.get(3).getNombre() + " " + Datos.get(3).getApellidos() + " || " + Datos.get(3).getCaballo().getJinete().getNombre() + " " + Datos.get(3).getCaballo().getJinete().getApellidos() + "   || " + Datos.get(3).getCaballo().getJinete().getPeso_jinete() + " Kilogramos ||");
            System.out.println("===========================================================================================================================================");
        }
        if (nueva.getCantidad_de_caballos() >= 5) {
            System.out.println(azul + "||     " + Datos.get(4).getCaballo().getJinete().getNumero_de_caballo() + "     || " + Datos.get(4).getCaballo().getNombre() + "    || " + Datos.get(4).getCaballo().getColor() + " || " + Datos.get(4).getCaballo().getRaza_de_caballo() + "  || " + Datos.get(4).getEquipo() + "  || " + Datos.get(4).getNombre() + " " + Datos.get(4).getApellidos() + "   || " + Datos.get(4).getCaballo().getJinete().getNombre() + " " + Datos.get(4).getCaballo().getJinete().getApellidos() + "    || " + Datos.get(4).getCaballo().getJinete().getPeso_jinete() + " Kilogramos ||");
            System.out.println("===========================================================================================================================================");
        }
        Datos(Datos, nueva);
    }

    /**
     *
     * @param Datos
     * @param nueva
     * @throws IOException
     * @throws InterruptedException
     */
    public static void Datos(ArrayList<Propietario> Datos, Pista nueva) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Apostador Apuesta = new Apostador();
        ArrayList<Apostador> apostador = new ArrayList<Apostador>();
        int jugador = 0;
        boolean otro_jugador = true;
        int jugadores = 0;
        while (otro_jugador && jugadores < 5) {
            System.out.println("Ingrese numero caballo a apostar : ");
            int numero_caballo = 0;
            boolean seguir_while = true;
            while (seguir_while) {
                try {
                    numero_caballo = Integer.parseInt(br.readLine());
                } catch (NumberFormatException ex) {
                    numero_caballo = 0;
                }
                if (numero_caballo < 1 || numero_caballo > nueva.getCantidad_de_caballos()) {
                    System.out.println("Cantidad incorrecta, Ingrese nuevamente");
                } else {
                    seguir_while = false;
                }
            }
            Apuesta.setNumero_de_caballo(numero_caballo);
            System.out.println("Cual es su nombre: ");
            Apuesta.setNombre(br.readLine());
            System.out.println("Cuales son sus apellidos: ");
            Apuesta.setApellidos(br.readLine());
            System.out.println("Cual es su cedula: ");
            Apuesta.setCedula(br.readLine());
            System.out.println("Cual es su numero de telefono: ");
            Apuesta.setNumero_de_telefono(br.readLine());
            System.out.println("Digite la cantidad a apostar con un minimo de $500 y maximo $2000: ");
            double cantidad_apuesta = 0.0;
            seguir_while = true;
            while (seguir_while) {
                try {
                    cantidad_apuesta = Integer.parseInt(br.readLine());
                } catch (NumberFormatException ex) {
                    cantidad_apuesta = 0;
                }
                if (cantidad_apuesta < 500 || cantidad_apuesta > 2000) {
                    System.out.println("Cantidad incorrecta, Ingrese nuevamente");
                } else {
                    seguir_while = false;
                }
            }
            Apuesta.setApuesta(cantidad_apuesta);
            apostador.add(Apuesta);
            Apuesta = new Apostador();
            System.out.println("Desea añadir otro jugador?: 1 para SI, 2 para NO");
            jugador = Integer.parseInt(br.readLine());
            if (jugador == 1) {
                otro_jugador = true;
            }
            if (jugador == 2) {
                otro_jugador = false;
            }
            jugadores++;
        }
        for (int i = 0; i < apostador.size(); i++) {
            System.out.println(apostador.get(i).getNombre());
        }
        crearArch();
        GuardaDatos(apostador);

        System.out.println("La carrera empieza en 3 segundos: ");
        Thread.sleep(3000);
        CasaApuestas.ganadoresPerdedores(apostador, Datos, nueva);
    }

    /**
     *
     */
    public static void crearArch() {
        String startDir = System.getProperty("user.dir")+"\\datos_carrera";
        File f00 = null;
        boolean bool = false;
        try {
            f00 = new File(startDir);

            bool = f00.mkdir();

            System.out.print("Cargando...");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    /**
     *
     * @param apostador
     * @throws IOException
     */
    private static void GuardaDatos(ArrayList<Apostador> apostador) throws IOException {
        String startDir = System.getProperty("user.dir")+"\\datos_carrera";
        BufferedWriter salida = null;
        int Contador = 1;
        try {
            FileWriter archi = new FileWriter(startDir +"\\Base de datos.txt");
            salida = new BufferedWriter(archi);
        } catch (FileNotFoundException x) {
            System.err.println(startDir + "\\Base de datos.txt");
            System.exit(2);
        }

        try {

            for (int i = 0; i < apostador.size(); i++) {

                salida.write("| Nombre de Apostador Numero " + Contador + " es : "
                        + String.valueOf(apostador.get(i).getNombre()) + "\n"
                        + "| Apellidos : " + String.valueOf(apostador.get(i).getApellidos()
                                + " \n" + "| Cedula : " + String.valueOf(apostador.get(i).getCedula()
                                        + " \n" + "| Numero de Telefono: " + String.valueOf(apostador.get(i).
                                                getNumero_de_telefono()) + "\n" + "| Numero De Caballo Al Que Aposto: " + String.valueOf(apostador.get(i).
                                                getNumero_de_caballo()) + "\n")) + "\n" + "| Numero De Asiento: " + String.valueOf(apostador.get(i).
                                getNumerodeapostador()) + " |\n" + "| La Apuesta Fue de: " + "$" + String.valueOf(apostador.get(i).getApuesta()));
                System.out.println();
                salida.newLine();
                Contador++;

            }
            salida.close();

        } catch (IOException x) {
            System.out.println("X: " + x.getMessage());
        }

    }

    public static void ExtraerDatos() throws InterruptedException, IOException {
         String startDir = System.getProperty("user.dir")+"\\datos_carrera";
       

        BufferedReader entrada = null;
        File f = null;
        boolean bool = false;
        try {
            FileReader archivo = new FileReader(startDir +"\\Base de datos.txt");
            entrada = new BufferedReader(archivo);
        } catch (FileNotFoundException x) {
            System.err.println("Archivo no encontrado: Base de datos.txt");
            System.exit(2);
        }
        try {
            f = new File(startDir);
            bool = f.mkdir();
            String linea = "";
            ArrayList conjunto = new ArrayList<String>();
            StringBuffer sb = new StringBuffer("");
            while ((linea = entrada.readLine()) != null) {

                String[] split = linea.split(" ");
                System.out.print(linea + "\n");
                conjunto.add(linea);
            }
        } catch (IOException x) {
            x.printStackTrace();
        }

    }

    /**
     *
     * @throws InterruptedException
     * @throws IOException
     */
    public static void rondas() throws InterruptedException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean ronda = true;
        int x ;
        propietarios();
        int cantidad_rondas = 0;
        while (ronda && cantidad_rondas < 10) {
            System.out.println("Desea otra carrera: [1] para si, [2] para no");
            x = Integer.parseInt(br.readLine());
            if (x == 1) {
                propietarios();
            }
            if (x == 2) {

                ronda = false;
                System.out.println("");
                Menu();
                
            }
            

            cantidad_rondas++;
        }
    }

}
