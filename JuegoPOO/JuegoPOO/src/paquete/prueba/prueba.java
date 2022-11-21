/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import java.util.Scanner;
import paquete.clases.*;
import paquete.gestion.GestionCuestionario;

/**
 *
 * @author ITALO F
 */
public class prueba {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------|BIENVENIDOS A TILINPREGUNTAS|---------------------------------------------------------------------"
                + "\nEste juego consiste basicamente en responder preguntas relacionadas a los videojuegos las cuales son mas dificiles segun el nivel de dificultad, habiando por el momento solo 3 tipos"
                + "\nde dificultades diferentes: Facil, Normal y Dificil. Ademas este juego por el momento solo se puede jugar de 2 personas. Asi que esperamos que puedan"
                + "\ndisfrutar de un buen momento entre amigos"
                + "\n");

        Facil fai = new Facil();
        fai.Informacion();

        Scanner sc = new Scanner(System.in);
        String dificultad = sc.nextLine();
        /*
        -----------------------------------ELEGIR DIFICULTAD-----------------------------
         */
        if (dificultad.equalsIgnoreCase("FACIL")) {
            System.out.println("Usted a elegido la dificultad: FACIL");
            System.out.print("\nIngresar nombre de Jugador 1: ");
            Facil fa1 = new Facil();
            fa1.NombredeUsuario();
            fa1.GeneradosdePreguntasyrespuestas();
            fa1.CalcularPuntaje();
            fa1.Puntajedeljugador();
            System.out.print("\nIngresar nombre de Jugador 2: ");
            Facil fa2 = new Facil();
            fa2.NombredeUsuario();
            fa2.GeneradosdePreguntasyrespuestas();
            fa2.CalcularPuntaje();
            fa2.Puntajedeljugador();

            System.out.println("\nOrdenar por mayor puntaje"
                    + "\n------------------");
            GestionCuestionario gc = new GestionCuestionario();
            gc.Ingresar(fa1);
            gc.Ingresar(fa2);
            gc.Ordenar();
            System.out.println(gc.VerInfo());

        } else if (dificultad.equalsIgnoreCase("NORMAL")) {
            System.out.println("Usted a elegido la dificultad: NORMAL");
            System.out.println("\nIngresar nombre de Jugador 1: ");
            Normal no1 = new Normal();
            no1.NombredeUsuario();
            no1.GeneradosdePreguntasyrespuestas();
            no1.CalcularPuntaje();
            no1.Puntajedeljugador();
            no1.PorcPuntaje();
            System.out.println("Ingresar nombre de Jugador 2: ");
            Normal no2 = new Normal();
            no2.NombredeUsuario();
            no2.GeneradosdePreguntasyrespuestas();
            no2.CalcularPuntaje();
            no2.Puntajedeljugador();
            no2.PorcPuntaje();

            System.out.println("\nOrdenar por mayor puntaje"
                    + "\n------------------");
            GestionCuestionario gc = new GestionCuestionario();
            gc.Ingresar(no1);
            gc.Ingresar(no2);
            gc.Ordenar();
            System.out.println(gc.VerInfo());

        } else if (dificultad.equalsIgnoreCase("DIFICIL")) {
            System.out.println("Usted a elegido la dificultad: DIFICIL");
            System.out.print("\nIngresar nombre de Jugador 1: ");
            Dificil di1 = new Dificil();
            di1.NombredeUsuario();
            di1.GeneradosdePreguntasyrespuestas();
            di1.CalcularPuntaje();
            di1.Puntajedeljugador();
            di1.PorcPuntaje();
            System.out.print("\nIngresar nombre de Jugador 2: ");
            Dificil di2 = new Dificil();
            di2.NombredeUsuario();
            di2.GeneradosdePreguntasyrespuestas();
            di2.CalcularPuntaje();
            di2.Puntajedeljugador();
            di2.PorcPuntaje();

            System.out.println("\nOrdenar por mayor puntaje"
                    + "\n------------------");
            GestionCuestionario gc = new GestionCuestionario();
            gc.Ingresar(di1);
            gc.Ingresar(di2);
            gc.Ordenar();
            System.out.println(gc.VerInfo());
        }

        /*
        --------------------------------PARA EVITAR QUE PONGAN CUALQUIER LETRA Y TERMINE EL JUEGO------------------------------------------
         */
        while (!"Facil".equalsIgnoreCase(dificultad) && !"Normal".equalsIgnoreCase(dificultad) && !"Dificil".equalsIgnoreCase(dificultad)) {
            System.out.println("\nAVISO: Por favor ingrese una dificultad existente"
                    + "\n");
            dificultad = sc.nextLine();
            if (dificultad.equalsIgnoreCase("Facil")) {
                System.out.println("\nUsted a elegido la dificultad: FACIL");
                System.out.print("\nIngresar nombre de Jugador 1: ");
                Facil fa1 = new Facil();
                fa1.NombredeUsuario();
                fa1.GeneradosdePreguntasyrespuestas();
                fa1.CalcularPuntaje();
                fa1.Puntajedeljugador();
                System.out.print("\nIngresar nombre de Jugador 2: ");
                Facil fa2 = new Facil();
                fa2.NombredeUsuario();
                fa2.GeneradosdePreguntasyrespuestas();
                fa2.CalcularPuntaje();
                fa2.Puntajedeljugador();

                System.out.println("\nOrdenar por mayor puntaje"
                        + "\n------------------");
                GestionCuestionario gc = new GestionCuestionario();
                gc.Ingresar(fa1);
                gc.Ingresar(fa2);
                gc.Ordenar();
                System.out.println(gc.VerInfo());

            } else if (dificultad.equalsIgnoreCase("Normal")) {
                System.out.println("Usted a elegido la dificultad: Normal");
                System.out.print("\nIngresar nombre de Jugador 1: ");
                Normal no1 = new Normal();
                no1.NombredeUsuario();
                no1.GeneradosdePreguntasyrespuestas();
                no1.CalcularPuntaje();
                no1.Puntajedeljugador();
                no1.PorcPuntaje();
                System.out.print("\nIngresar nombre de Jugador 2: ");
                Normal no2 = new Normal();
                no2.NombredeUsuario();
                no2.GeneradosdePreguntasyrespuestas();
                no2.CalcularPuntaje();
                no2.Puntajedeljugador();
                no2.PorcPuntaje();

                System.out.println("\nOrdenar por mayor puntaje"
                        + "\n------------------");
                GestionCuestionario gc = new GestionCuestionario();
                gc.Ingresar(no1);
                gc.Ingresar(no2);
                gc.Ordenar();
                System.out.println(gc.VerInfo());

            } else if (dificultad.equalsIgnoreCase("Dificil")) {
                System.out.println("Usted a elegido la dificultad: Dificil");
                System.out.print("\nIngresar nombre de Jugador 1: ");
                Dificil di1 = new Dificil();
                di1.NombredeUsuario();
                di1.GeneradosdePreguntasyrespuestas();
                di1.CalcularPuntaje();
                di1.Puntajedeljugador();
                di1.PorcPuntaje();
                System.out.println("\nIngresar nombre de Jugador 2: ");
                Dificil di2 = new Dificil();
                di2.NombredeUsuario();
                di2.GeneradosdePreguntasyrespuestas();
                di2.CalcularPuntaje();
                di2.Puntajedeljugador();
                di2.PorcPuntaje();

                System.out.println("\nOrdenar por mayor puntaje"
                        + "\n------------------");
                GestionCuestionario gc = new GestionCuestionario();
                gc.Ingresar(di1);
                gc.Ingresar(di2);
                gc.Ordenar();
                System.out.println(gc.VerInfo());

            }

        }
        int opcion = 0;
        System.out.println("¿Que desea realizar ahora?");
        System.out.println("1. Volver a jugar");
        System.out.println("2. Terminar el juego");
        while (opcion != 2) {
            opcion = sc.nextInt();// Para que si ponen la opcion 2 que termine el juego y si no que vuelva a preguntar hasta que ponga 2
            if (opcion == 1) {
                System.out.println("---------------------------------------------------|BIENVENIDOS NUEVAMENTE A TILINPREGUNTAS|---------------------------------------------------------------------"
                        + "\nEste juego consiste basicamente en responder preguntas relacionadas a los videojuegos las cuales son mas dificiles segun el nivel de dificultad, habiando por el momento solo 3 tipos"
                        + "\nde dificultades diferentes: Facil, Normal y Dificil. Ademas este juego por el momento solo se puede jugar de 2 personas. Asi que esperamos que puedan"
                        + "\ndisfrutar de un buen momento entre amigos"
                        + "\n");

                Facil faci = new Facil();
                faci.Informacion();
                Scanner scan = new Scanner(System.in);
                String dific = scan.nextLine();
                if (dific.equalsIgnoreCase("FACIL")) {
                    System.out.println("Usted a elegido la dificultad: FACIL");
                    System.out.print("\nIngresar nombre de Jugador 1: ");
                    Facil fa1 = new Facil();
                    fa1.NombredeUsuario();
                    fa1.GeneradosdePreguntasyrespuestas();
                    fa1.CalcularPuntaje();
                    fa1.Puntajedeljugador();
                    System.out.print("\nIngresar nombre de Jugador 2: ");
                    Facil fa2 = new Facil();
                    fa2.NombredeUsuario();
                    fa2.GeneradosdePreguntasyrespuestas();
                    fa2.CalcularPuntaje();
                    fa2.Puntajedeljugador();

                    System.out.println("\nOrdenar por mayor puntaje"
                            + "\n------------------");
                    GestionCuestionario gc = new GestionCuestionario();
                    gc.Ingresar(fa1);
                    gc.Ingresar(fa2);
                    gc.Ordenar();
                    System.out.println(gc.VerInfo());
                    System.out.println("¿Que desea realizar ahora?");
                    System.out.println("1. Volver a jugar");
                    System.out.println("2. Terminar el juego");

                } else if (dific.equalsIgnoreCase("NORMAL")) {
                    System.out.println("Usted a elegido la dificultad: NORMAL");
                    System.out.println("\nIngresar nombre de Jugador 1: ");
                    Normal no1 = new Normal();
                    no1.NombredeUsuario();
                    no1.GeneradosdePreguntasyrespuestas();
                    no1.CalcularPuntaje();
                    no1.Puntajedeljugador();
                    no1.PorcPuntaje();
                    System.out.println("Ingresar nombre de Jugador 2: ");
                    Normal no2 = new Normal();
                    no2.NombredeUsuario();
                    no2.GeneradosdePreguntasyrespuestas();
                    no2.CalcularPuntaje();
                    no2.Puntajedeljugador();
                    no2.PorcPuntaje();

                    System.out.println("\nOrdenar por mayor puntaje"
                            + "\n------------------");
                    GestionCuestionario gc = new GestionCuestionario();
                    gc.Ingresar(no1);
                    gc.Ingresar(no2);
                    gc.Ordenar();
                    System.out.println(gc.VerInfo());
                    System.out.println("¿Que desea realizar ahora?");
                    System.out.println("1. Volver a jugar");
                    System.out.println("2. Terminar el juego");

                } else if (dific.equalsIgnoreCase("DIFICIL")) {
                    System.out.println("Usted a elegido la dificultad: DIFICIL");
                    System.out.print("\nIngresar nombre de Jugador 1: ");
                    Dificil di1 = new Dificil();
                    di1.NombredeUsuario();
                    di1.GeneradosdePreguntasyrespuestas();
                    di1.CalcularPuntaje();
                    di1.Puntajedeljugador();
                    di1.PorcPuntaje();
                    System.out.print("\nIngresar nombre de Jugador 2: ");
                    Dificil di2 = new Dificil();
                    di2.NombredeUsuario();
                    di2.GeneradosdePreguntasyrespuestas();
                    di2.CalcularPuntaje();
                    di2.Puntajedeljugador();
                    di2.PorcPuntaje();

                    System.out.println("\nOrdenar por mayor puntaje"
                            + "\n------------------");
                    GestionCuestionario gc = new GestionCuestionario();
                    gc.Ingresar(di1);
                    gc.Ingresar(di2);
                    gc.Ordenar();
                    System.out.println(gc.VerInfo());
                    System.out.println("¿Que desea realizar ahora?");
                    System.out.println("1. Volver a jugar");
                    System.out.println("2. Terminar el juego");
                }

                /*
        --------------------------------PARA EVITAR QUE PONGAN CUALQUIER LETRA Y TERMINE EL JUEGO------------------------------------------
                 */
                while (!"Facil".equalsIgnoreCase(dific) && !"Normal".equalsIgnoreCase(dific) && !"Dificil".equalsIgnoreCase(dific)) {
                    System.out.println("\nAVISO: Por favor ingrese una dificultad existente"
                            + "\n");
                    dific = sc.nextLine();
                    if (dific.equalsIgnoreCase("Facil")) {
                        System.out.println("\nUsted a elegido la dificultad: FACIL");
                        System.out.print("\nIngresar nombre de Jugador 1: ");
                        Facil fa1 = new Facil();
                        fa1.NombredeUsuario();
                        fa1.GeneradosdePreguntasyrespuestas();
                        fa1.CalcularPuntaje();
                        fa1.Puntajedeljugador();
                        System.out.print("\nIngresar nombre de Jugador 2: ");
                        Facil fa2 = new Facil();
                        fa2.NombredeUsuario();
                        fa2.GeneradosdePreguntasyrespuestas();
                        fa2.CalcularPuntaje();
                        fa2.Puntajedeljugador();

                        System.out.println("\nOrdenar por mayor puntaje"
                                + "\n------------------");
                        GestionCuestionario gc = new GestionCuestionario();
                        gc.Ingresar(fa1);
                        gc.Ingresar(fa2);
                        gc.Ordenar();
                        System.out.println(gc.VerInfo());
                        System.out.println("¿Que desea realizar ahora?");
                        System.out.println("1. Volver a jugar");
                        System.out.println("2. Terminar el juego");

                    } else if (dific.equalsIgnoreCase("Normal")) {
                        System.out.println("Usted a elegido la dificultad: Normal");
                        System.out.print("\nIngresar nombre de Jugador 1: ");
                        Normal no1 = new Normal();
                        no1.NombredeUsuario();
                        no1.GeneradosdePreguntasyrespuestas();
                        no1.CalcularPuntaje();
                        no1.Puntajedeljugador();
                        no1.PorcPuntaje();
                        System.out.print("\nIngresar nombre de Jugador 2: ");
                        Normal no2 = new Normal();
                        no2.NombredeUsuario();
                        no2.GeneradosdePreguntasyrespuestas();
                        no2.CalcularPuntaje();
                        no2.Puntajedeljugador();
                        no2.PorcPuntaje();

                        System.out.println("\nOrdenar por mayor puntaje"
                                + "\n------------------");
                        GestionCuestionario gc = new GestionCuestionario();
                        gc.Ingresar(no1);
                        gc.Ingresar(no2);
                        gc.Ordenar();
                        System.out.println(gc.VerInfo());
                        System.out.println("¿Que desea realizar ahora?");
                        System.out.println("1. Volver a jugar");
                        System.out.println("2. Terminar el juego");

                    } else if (dific.equalsIgnoreCase("Dificil")) {
                        System.out.println("Usted a elegido la dificultad: Dificil");
                        System.out.print("\nIngresar nombre de Jugador 1: ");
                        Dificil di1 = new Dificil();
                        di1.NombredeUsuario();
                        di1.GeneradosdePreguntasyrespuestas();
                        di1.CalcularPuntaje();
                        di1.Puntajedeljugador();
                        di1.PorcPuntaje();
                        System.out.println("\nIngresar nombre de Jugador 2: ");
                        Dificil di2 = new Dificil();
                        di2.NombredeUsuario();
                        di2.GeneradosdePreguntasyrespuestas();
                        di2.CalcularPuntaje();
                        di2.Puntajedeljugador();
                        di2.PorcPuntaje();

                        System.out.println("\nOrdenar por mayor puntaje"
                                + "\n------------------");
                        GestionCuestionario gc = new GestionCuestionario();
                        gc.Ingresar(di1);
                        gc.Ingresar(di2);
                        gc.Ordenar();
                        System.out.println(gc.VerInfo());
                        System.out.println("¿Que desea realizar ahora?");
                        System.out.println("1. Volver a jugar");
                        System.out.println("2. Terminar el juego");

                    }
                }
            } else {
                System.out.println("Ingrese una opcion correcta");
                System.out.println("¿Que desea realizar ahora?");
                System.out.println("1. Volver a jugar");
                System.out.println("2. Terminar el juego");

            }

        }

        System.out.println("GRACIAS POR JUGAR, TENGAN BUEN DIA");
    }

}
