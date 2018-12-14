/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

/**
 *
 * @author dam
 */
public class Curso {
    private int plazas;
    private int ocupadas;
    private int suma;
    
   

    public Curso(int nplazas) {
       plazas=nplazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public int getOcupadas() {
        return ocupadas;
    }

    public int getSuma() {
        return suma;
    }
    public int plazasDisponibles(){
        int plazasDisponibles=0;
   return plazasDisponibles;
    }
     public void matricular(int edad) {
        suma=suma+edad;
        ocupadas++;
    }
     public float pOcupacion(){
        int pOcupacion=0;
        return pOcupacion;
     }
     public int calculoMedia(){
        int media=0;
        return media;
     } 
     public int disponibilidad(){
         return plazas-ocupadas;
     }
    public int edadMedia(){
        int media=0;
        if(ocupadas!=0){
        media=suma/ocupadas;
        }
        return media;
    }
    public float porcentaje(){
        float porcentaje=0;
        if(plazas!=0){
            porcentaje=(float)ocupadas/plazas*100;
        }
        return porcentaje;
    }
    
}
