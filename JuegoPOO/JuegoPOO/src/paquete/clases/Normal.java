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
public class Normal extends Cuestionario implements Interfaz
{
    private String[]PreguntaNO = {"¿Cuál fue primero?",".¿Cuántos luchadores hay en Street Fighter?","¿Cuál es un videojuego de autos de carrera?","¿Cómo se llama el enemigo de Sonic?","¿Cuál fue la primera consola de Playstation?","¿Cuál es el material de la primera espada que recibes en The Legend of Zelda?","¿Cuál de estas consolas pertenece a la compañía Sony?","¿Cómo se llama la ciudad en la que se desenvuelve el videojuego Resident Evil?","¿Qué significa en el lenguaje gamer “Farmear”?","¿Qué significa el color rojo en la consola Xbox 360?"};
    private String[]RespuestaNOA = {"Pac-Man","12","R-Type","Dr. Malo","PS Project","Hueso","Ps4","New York","Matar enemigos","Que la consola no tiene suficiente ventilación "};
    private String[]RespuestaNOB = {"Tetris","8","Snake","Robotech","PS1","Madera","Xbox One","Racoon City","Mejorar habilidades","Que el mando ha perdido la conexión"};
    private String[]RespuestaNOC = {"Pong","4","Frogger","Tails","Play One","Hierro","Nintendo Switch","Metropolis","Evadir al rival","Que la tarjeta gráfica está dando problemas"};
    private String[]RespuestaNOD = {"Donkey Kong","16","Top Gear","Dr. Robotnik","Playstation Origin","Acero","Ninguna","Resident City","Recolectar recursos","Que el internet se ha desconectado"};
    private String[]RptaNO;
    private float prompun;

    public Normal() 
    {
        RptaNO = new String[10];
    }

    public String[] getPreguntaNO() {
        return PreguntaNO;
    }

    public void setPreguntaNO(String[] PreguntaNO) {
        this.PreguntaNO = PreguntaNO;
    }

    public String[] getRespuestaNOA() {
        return RespuestaNOA;
    }

    public void setRespuestaNOA(String[] RespuestaNOA) {
        this.RespuestaNOA = RespuestaNOA;
    }

    public String[] getRespuestaNOB() {
        return RespuestaNOB;
    }

    public void setRespuestaNOB(String[] RespuestaNOB) {
        this.RespuestaNOB = RespuestaNOB;
    }

    public String[] getRespuestaNOC() {
        return RespuestaNOC;
    }

    public void setRespuestaNOC(String[] RespuestaNOC) {
        this.RespuestaNOC = RespuestaNOC;
    }

    public String[] getRespuestaNOD() {
        return RespuestaNOD;
    }

    public void setRespuestaNOD(String[] RespuestaNOD) {
        this.RespuestaNOD = RespuestaNOD;
    }

    public String[] getRptaNO() {
        return RptaNO;
    }

    public void setRptaNO(String[] RptaNO) {
        this.RptaNO = RptaNO;
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
        System.out.println("--------------------PREGUNTAS DE DIFICULTAD: NORMAL--------------------------"
                + "\nSuerte amigo " + this.NomUsu + ", esperamos que puedas responder las " + this.PreguntaNO.length + " preguntas correctamente."
                        + "\n");
        
        for(int i = 0;i<10;i++)
        {
            System.out.println((i+1) + ")" + " " +  PreguntaNO[i] +
                    "\nA)" + RespuestaNOA[i] +
                    "\nB)" + RespuestaNOB[i] +
                    "\nC)" + RespuestaNOC[i] +
                    "\nD)" + RespuestaNOD[i] +
                    "\n");
            Scanner can = new Scanner(System.in);
            System.out.println("Ingrese su respuesta: ");
            RptaNO[i] = can.nextLine();
            while(!"A".equalsIgnoreCase(RptaNO[i]) && !"B".equalsIgnoreCase(RptaNO[i]) && !"C".equalsIgnoreCase(RptaNO[i]) && !"D".equalsIgnoreCase(RptaNO[i]))
            {
                System.out.println("\nAVISO: Por favor ingrese una respuesta existente"
                    + "\n");
            RptaNO[i] = can.nextLine();
            }
            System.out.println(" ");
           
        }
    }
    
    @Override
    public void CalcularPuntaje() 
    {
            if(RptaNO[0].equalsIgnoreCase("C"))
            {
                this.puntaje = puntaje + 1;
                
            } 
            else 
            {
                this.puntaje = puntaje + 0;    
            }
        if(RptaNO[1].equalsIgnoreCase("A"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
               this.puntaje = puntaje + 0;  
            }
        if(RptaNO[2].equalsIgnoreCase("D"))
            {
                this.puntaje = puntaje + 1;
            } 
            else 
            {
                this.puntaje = puntaje + 0;
            }
        if(RptaNO[3].equalsIgnoreCase("D"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
                this.puntaje = puntaje + 0;  
            }
        if(RptaNO[4].equalsIgnoreCase("B"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
                this.puntaje = puntaje + 0;   
            }
        if(RptaNO[5].equalsIgnoreCase("B"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
                this.puntaje = puntaje + 0;   
            }
        if(RptaNO[6].equalsIgnoreCase("A"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
               this.puntaje = puntaje + 0;   
            }
        if(RptaNO[7].equalsIgnoreCase("B"))
            {
                this.puntaje = puntaje + 1;   
            } 
            else 
            {
                this.puntaje = puntaje + 0;
            }
        if(RptaNO[8].equalsIgnoreCase("D"))
            {
                this.puntaje = puntaje + 1;    
            } 
            else 
            {
               this.puntaje = puntaje + 1;    
            }
        if(RptaNO[9].equalsIgnoreCase("A"))
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
        if (puntaje > 4)
        {
            System.out.println("Uy, pibe " + NomUsu + " usted es alguien no muy inteligente");
        }
        else if(puntaje > 5 && puntaje <= 9)
        {
            System.out.println("Pibe " + NomUsu + " usted es alguien listo");
        }
        else if(puntaje == 10)
        {
            System.out.println("Felicidades " + NomUsu + " usted alguien muy inteligente");
        };
    }   

    @Override
    public void PorcPuntaje() 
    {
        prompun = Float.valueOf(puntaje) * 10;
        System.out.println("Su porcentaje de inteligencia es de: " + prompun + "%");
    }

    @Override
    public String VerInfo() 
    {
        return super.VerInfo();
    }
    
    
    
    
}
