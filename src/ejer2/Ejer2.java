/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import java.io.IOException;
import numeros.Numero;

/**
 *
 * @author dam
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        int plazas1;
       Curso curso1=new Curso(Numero.pedirNumero("plazas del curso1", 0));
       Curso curso2=new Curso(Numero.pedirNumero("plazas del curso2", 0));
       Curso curso3=new Curso(Numero.pedirNumero("plazas del curso3", 0));
       Academia miAcademia=new Academia();
       miAcademia.pedirPlazas();
       miAcademia.matricular();
       miAcademia.informe();
       
    }

   
            
    
}
