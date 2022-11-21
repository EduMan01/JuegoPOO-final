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
public class Dificil extends Cuestionario implements Interfaz
{
    private String[]PreguntaDI = {"¿Que instrumento de viento suele usar Link de The Legend of Zelda?","¿De que personaje busca venganza Kratos en God of War?",
    "¿Cómo se llama la institución mental que sirve de escenario en OutLast?","¿En que año fue lanzado Super Mario 64?","¿Cómo se llama el fundador de la compañía Nintendo?","¿Cómo se llama el mando de Wii?","¿Cuál de estas empresas no es un estudio de videojuegos?","¿Cuál es el primer oficio de Mario?","¿En que se inspiro el creador de Pac Man para crear este personaje?","¿Con cuantos jugadores puedes competir al mismo tiempo en el videojuego Formula 1 2022?",
    "¿Cuál es la consola de juegos mas vendida hasta la fecha?","¿Cuál fue el primer videojuego de estrategia en tiempo real?","¿Cómo se llama la hija de Drake en Uncharted 4?","¿Cuántas entregas tiene la saga battlefield?","¿En que año salio el primer Call of Duty?"};
    
    private String[]RespuestaDIA = {"Flauta","Atenea",
    "Hospital Severalls","1995","¿Shigeru Miyamoto","WiiControl","Valve","Carpintero","En una galleta","Con 12",
    "Playstation 4","The Ancient Art of War","Cassie","19","1999"};
    
    private String[]RespuestaDIB = {"Armónica","Zeus",
    "¿Hospital Estatal de Filadelfia","1996","Satoru Iwata","MandoWii","Smilegate","Fontanero","En una tarta","Con 18",
    "Playstation 2","Age of Empires","Natasha","14","2000"};
    
    private String[]RespuestaDIC = {"Saxofon","Ares",
    "Mount Massive","1998","Hideo Kojima","Wiimote","Mixi","Electricista","En una pizza","Con 22",
    "Nintendo Ds","StarCraft","Lucy","22","2005"};
    
    private String[]RespuestaDID = {"Ocarina","Poseidon",
    "Hospital Whittingham","1999","Fusajiro Yamauchi","Nunchuk","RyoGames","Panadero","En un pie","Con 20",
    "Xbox 360","WarCraft","Sophy","25","2003"};
    
    private String[]RespuestaDIE = {"Trompeta","Hermes",
    "Hospital Johns Hopkins","1994","Katsuhiro Umeyama","WiiGamecontrol","Tencent","Cocinero","En un disco","Con 15",
    "Xbox One","Age of Mythology","Emma","20","1997"};
    
    private String[]RptaDI;
    private float prompun;

    public Dificil() 
    {
        RptaDI = new String[15];
    }

    public String[] getPreguntaDI() {
        return PreguntaDI;
    }

    public void setPreguntaDI(String[] PreguntaDI) {
        this.PreguntaDI = PreguntaDI;
    }

    public String[] getRespuestaDIA() {
        return RespuestaDIA;
    }

    public void setRespuestaDIA(String[] RespuestaDIA) {
        this.RespuestaDIA = RespuestaDIA;
    }

    public String[] getRespuestaDIB() {
        return RespuestaDIB;
    }

    public void setRespuestaDIB(String[] RespuestaDIB) {
        this.RespuestaDIB = RespuestaDIB;
    }

    public String[] getRespuestaDIC() {
        return RespuestaDIC;
    }

    public void setRespuestaDIC(String[] RespuestaDIC) {
        this.RespuestaDIC = RespuestaDIC;
    }

    public String[] getRespuestaDID() {
        return RespuestaDID;
    }

    public void setRespuestaDID(String[] RespuestaDID) {
        this.RespuestaDID = RespuestaDID;
    }

    public String[] getRespuestaDIE() {
        return RespuestaDIE;
    }

    public void setRespuestaDIE(String[] RespuestaDIE) {
        this.RespuestaDIE = RespuestaDIE;
    }

    public String[] getRptaDI() {
        return RptaDI;
    }

    public void setRptaDI(String[] RptaDI) {
        this.RptaDI = RptaDI;
    }

    public float getPrompun() {
        return prompun;
    }

    public void setPrompun(float prompun) {
        this.prompun = prompun;
    }
    
    

    @Override
    public void GeneradosdePreguntasyrespuestas() 
    {
        System.out.println("--------------------PREGUNTAS DE DIFICULTAD: DIFICIL-------------------------"
                + "\nSuerte amigo " + this.NomUsu + ", esperamos que puedas responder las " + this.PreguntaDI.length + " preguntas correctamente."
                        + "\n");
        for(int i = 0;i<15;i++)
        {
            System.out.println((i+1) + ")" + " " +  PreguntaDI[i] +
                    "\nA)" + RespuestaDIA[i] +
                    "\nB)" + RespuestaDIB[i] +
                    "\nC)" + RespuestaDIC[i] +
                    "\nD)" + RespuestaDID[i] +
                    "\nE)" + RespuestaDIE[i] +
                    "\n");
            Scanner can = new Scanner(System.in);
            System.out.println("Ingrese su respuesta: ");
            RptaDI[i] = can.nextLine();
            while(!"A".equalsIgnoreCase(RptaDI[i]) && !"B".equalsIgnoreCase(RptaDI[i]) && !"C".equalsIgnoreCase(RptaDI[i]) && !"D".equalsIgnoreCase(RptaDI[i]) && !"E".equalsIgnoreCase(RptaDI[i]))
            {
                System.out.println("\nAVISO: Por favor ingrese una respuesta existente"
                    + "\n");
            RptaDI[i] = can.nextLine();
            }
            System.out.println(" ");
        }; 
    }
    
    @Override
    public void CalcularPuntaje() 
    {
        if(RptaDI[0].equalsIgnoreCase("D"))
            {
                this.puntaje = puntaje + 1;
            } 
            else 
            {
                this.puntaje = puntaje + 0;    
            }
        if(RptaDI[1].equalsIgnoreCase("C"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
               this.puntaje = puntaje + 0;  
            }
        if(RptaDI[2].equalsIgnoreCase("C"))
            {
                this.puntaje = puntaje + 1;
            } 
            else 
            {
                this.puntaje = puntaje + 0;
            }
        if(RptaDI[3].equalsIgnoreCase("B"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
                this.puntaje = puntaje + 0;  
            }
        if(RptaDI[4].equalsIgnoreCase("D"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
                this.puntaje = puntaje + 0;   
            }
        if(RptaDI[5].equalsIgnoreCase("C"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
                this.puntaje = puntaje + 0;   
            }
        if(RptaDI[6].equalsIgnoreCase("D"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
               this.puntaje = puntaje + 0;   
            }
        if(RptaDI[7].equalsIgnoreCase("A"))
            {
                this.puntaje = puntaje + 1;   
            } 
            else 
            {
                this.puntaje = puntaje + 0;
            }
        if(RptaDI[8].equalsIgnoreCase("C"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
               this.puntaje = puntaje + 1;    
            }
        if(RptaDI[9].equalsIgnoreCase("C"))
            {
                this.puntaje = puntaje + 1;   
            } 
            else 
            {
                 this.puntaje = puntaje + 0;  
            }
        if(RptaDI[10].equalsIgnoreCase("B"))
            {
                this.puntaje = puntaje + 1;   
            } 
            else 
            {
                 this.puntaje = puntaje + 0;  
            }
        if(RptaDI[11].equalsIgnoreCase("B"))
            {
                this.puntaje = puntaje + 1;   
            } 
            else 
            {
                 this.puntaje = puntaje + 0;  
            }
        if(RptaDI[12].equalsIgnoreCase("A"))
            {
                this.puntaje = puntaje + 1;   
            } 
            else 
            {
                 this.puntaje = puntaje + 0;  
            }
        if(RptaDI[13].equalsIgnoreCase("C"))
            {
                this.puntaje = puntaje + 1;   
            } 
            else 
            {
                 this.puntaje = puntaje + 0;  
            }
        if(RptaDI[14].equalsIgnoreCase("D"))
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
        if (puntaje <= 6)
        {
            System.out.println("Uy, pibe " + NomUsu + " es usted alguien no muy inteligente");
        }
        else if(puntaje > 7 && puntaje <= 14)
        {
            System.out.println("Pibe " + NomUsu + " es usted alguien listo");
        }
        else if(puntaje == 15)
        {
            System.out.println("Felicidades " + NomUsu + " es usted alguien muy inteligente");
        }
    }

    @Override
    public void PorcPuntaje() 
    {
        prompun = Float.valueOf(puntaje) * 7 - 5;
        System.out.println("Su porcentaje de inteligencia es de: " + prompun + "%");
    }

    @Override
    public String VerInfo() 
    {
        return super.VerInfo();
    }
    
    
    
    
    
}
