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
public class Facil extends Cuestionario
{
    private String[]PreguntaFA = {"¿Cómo se llama el hermano de Mario Bros?","¿En qué videojuegos aparece la princesa Peach?","El videojuego Battlefront está basado en las películas de...","¿Cuál es el tipo de videojuego que mas mejora la mente?","¿Qué videojuego fue creado por el famoso diseñador conocido como Notch?"};
    private String[]RespuestaFAA = {"Luigi","Pokemon","El señor de los Anillos","Acción","Minecraft"};
    private String[]RespuestaFAB = {"Mario Jr","Super Mario","Fast and Furius","RPG","Pac-Man"};
    private String[]RespuestaFAC = {"Honguito","Dracula","Star Wars","Estrategia","League of Legends"};
    private String[]RptaFA;

    public Facil() 
    {
        RptaFA = new String[5];
    }

    public String[] getPreguntaNO() {
        return PreguntaFA;
    }

    public void setPreguntaNO(String[] PreguntaNO) {
        this.PreguntaFA = PreguntaNO;
    }

    public String[] getRespuestaNOa() {
        return RespuestaFAA;
    }

    public void setRespuestaNOa(String[] RespuestaNOa) {
        this.RespuestaFAA = RespuestaNOa;
    }

    public String[] getRespuestaNOb() {
        return RespuestaFAB;
    }

    public void setRespuestaNOb(String[] RespuestaNOb) {
        this.RespuestaFAB = RespuestaNOb;
    }

    public String[] getRespuestaNOc() {
        return RespuestaFAC;
    }

    public void setRespuestaNOc(String[] RespuestaNOc) {
        this.RespuestaFAC = RespuestaNOc;
    }

    public String[] getCantPre() {
        return RptaFA;
    }

    public void setCantPre(String[] CantPre) {
        this.RptaFA = CantPre;
    }

    @Override
    public void GeneradosdePreguntasyrespuestas() 
    {
        System.out.println("--------------------PREGUNTAS DE DIFICULTAD: FACIL--------------------------"
                + "\nSuerte amigo " + this.NomUsu + ", esperamos que puedas responder las " + this.PreguntaFA.length + " preguntas correctamente."
                        + "\n");
        for(int i = 0;i<5;i++)
        {
            System.out.println((i+1) + ")" + " " +  PreguntaFA[i] +
                    "\nA)" + RespuestaFAA[i] +
                    "\nB)" + RespuestaFAB[i] +
                    "\nC)" + RespuestaFAC[i] +
                    "\n");
            Scanner can = new Scanner(System.in);
            System.out.println("Ingrese su respuesta: ");
            RptaFA[i] = can.nextLine();
            while(!"A".equalsIgnoreCase(RptaFA[i]) && !"B".equalsIgnoreCase(RptaFA[i]) && !"C".equalsIgnoreCase(RptaFA[i]))
            {
                System.out.println("\nAVISO: Por favor ingrese una respuesta existente"
                    + "\n");
            RptaFA[i] = can.nextLine();
            }
            System.out.println(" ");
            
        }
    }
    
    @Override
    public void CalcularPuntaje() 
    {
        if(RptaFA[0].equalsIgnoreCase("A"))
            {
                this.puntaje = puntaje + 1;
            } 
            else 
            {
                this.puntaje = puntaje + 0;    
            }
            
        if(RptaFA[1].equalsIgnoreCase("B"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
               this.puntaje = puntaje + 0;  
            }
        if(RptaFA[2].equalsIgnoreCase("C"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
                this.puntaje = puntaje + 0;   
            }
        if(RptaFA[3].equalsIgnoreCase("C"))
            {
                this.puntaje = puntaje + 1;   
            } 
            else 
            {
                this.puntaje = puntaje + 0;  
            }
        if(RptaFA[4].equalsIgnoreCase("A"))
            {
                this.puntaje = puntaje + 1;   
            } 
            else 
            {
                this.puntaje = puntaje + 0;  
            }
    }

    @Override
    public void Puntajedeljugador() 
    {
        System.out.println("Puntaje final de " + NomUsu + "fue de: " + puntaje + " puntos\n");
        if (puntaje >= 1)
        {
            System.out.println("Uy, pibe " + NomUsu + " usted es alguien no muy inteligente");
        }
        else if(puntaje > 2 && puntaje <= 4)
        {
            System.out.println("Pibe " + NomUsu + " usted es alguien listo");
        }
        else if(puntaje == 5)
        {
            System.out.println("Felicidades " + NomUsu + " usted es alguien muy inteligente");
        };
    }

    @Override
    public String VerInfo() {
        return super.VerInfo();
    }

    
    
    
    
}
