/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Scanner;

/**
 *
 * @author ITALO F
 */
public abstract class Cuestionario 
{
    protected String Respuesta;
    protected String Pregunta;
    protected String NomUsu;
    protected int puntaje;
    private String info;

    public Cuestionario() 
    {
        puntaje = 0;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

    public String getNomUsu() {
        return NomUsu;
    }

    public void setNomUsu(String NomUsu) {
        this.NomUsu = NomUsu;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
    
    public void NombredeUsuario()
    {
        Scanner jug1 = new Scanner(System.in);
        NomUsu = jug1.nextLine();
        System.out.println("");
    }
    
    public void Informacion()
    {
        while (!"A".equalsIgnoreCase(info)) 
        {
            System.out.println("A) Empezar el juego"+
                "\nB) Informacion del juego" +
                "\nC) Creditos");
            Scanner iff = new Scanner(System.in);
            System.out.print("Seleccione una opcion: ");
            info = iff.nextLine();
            if (info.equalsIgnoreCase("B"))
                {
                    System.out.println("Informacion del juego:"
                            + "\n-Cada pregunta vale 1 punto"
                            + "\n-El jugador que tenga mas puntos gana " +
                            "\n-La dificultad FACIL consta de 5 preguntas, cada pregunta consta de 3 opciones a elegir" +
                            "\n-La dificultad NORMAL consta de 10 preguntas, cada pregunta consta de 4 opciones a elegir"+
                            "\n-La dificultad DIFICIL consta de 15 preguntas, cada pregunta consta de 5 opciones a elegir\n");
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("\nPulse enter para volver al menu");
                            teclado.nextLine();
                    
                }
            else if(info.equalsIgnoreCase("C"))
                {
                    System.out.println("Creditos"
                            + "\nCreadores:" +
                            "\nItalo Fernandez" +
                            "\nEduardo Tello" +
                            "\nFantino Camara" +
                            "\nLa version actual del juego es una alfa\n");
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("\nPulse enter para volver al menu");
                            teclado.nextLine();

                }

            else if(info.equalsIgnoreCase("A"))
            {
                System.out.print("Ingrese una dificultad: ");
            }
                    
        }
        
    }
    
    public abstract void CalcularPuntaje();
    
    public abstract void GeneradosdePreguntasyrespuestas();
    
    public abstract void Puntajedeljugador();

    public String VerInfo() 
    {
        return "Nombre del usuario: " + this.NomUsu + 
                "\nPuntaje del usuario: " + puntaje +
                "\n------------------";
    }
    
    
}
