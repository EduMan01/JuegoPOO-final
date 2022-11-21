/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import java.util.Random;
import paquete.clases.Cuestionario;
import paquete.clases.*;

/**
 *
 * @author ITALO F
 */
public class GestionCuestionario 
{
    private Cuestionario[]arreglo;
    private int conta;

    public GestionCuestionario() 
    {
        arreglo = new Cuestionario[100];
        conta = 0;
    }

    public Cuestionario[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Cuestionario[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    public void Ingresar(Cuestionario ref)
    {
        if(conta<arreglo.length)
        {
            arreglo[conta] = ref;
            conta++;
        }
        else
        {
            System.out.println("No hay espacio");
        }
    }
    
    public void Ordenar(){
        Cuestionario aux;
        for(int i=0;i<conta-1;i++)
        {
            for(int j=i+1;j<conta;j++)
            {
                if(arreglo[i].getPuntaje()<arreglo[j].getPuntaje())
                {
                    aux=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }
    }
    
    public String VerInfo(){
        String cad="";
        for(int i=0;i<conta;i++)
        {
            cad=cad+arreglo[i].VerInfo()+"\n";
            
        }
        return cad;
        
    }
}
