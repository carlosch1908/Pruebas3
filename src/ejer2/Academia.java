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
public class Academia {

    Curso curso1;
    Curso curso2;
    Curso curso3;

    public Academia(Curso curso1, Curso curso2, Curso curso3) {
        this.curso1 = curso1;
        this.curso2 = curso2;
        this.curso3 = curso3;
    }

    public Academia() {

    }

    public void pedirPlazas() throws IOException {
        curso1 = new Curso(Numero.pedirNumero("Numero de plazas del curso", 1));
        curso2 = new Curso(Numero.pedirNumero("Numero de plazas del curso", 1));
        curso3 = new Curso(Numero.pedirNumero("Numero de plazas del curso", 1));
    }

    public void matricularCurso(Curso curso) throws IOException {
        int edad;
        if (curso.disponibilidad() > 0) {
            edad = Numero.pedirNumero("Edad del alumno", 0, 20);
            curso.matricular(edad);
            System.out.println("Alumno matriculado");
        } else {
            System.out.println("No hay plazas en ese curso");

        }
    }

    public void matricular() throws IOException {
        int curso;
        curso = Numero.pedirNumero("Introduce curso", -1, 3);
        while (curso != -1 && existenPlazas()) {
            switch (curso) {
                case 1:
                    matricularCurso(curso1);
                    break;

                case 2:
                    matricularCurso(curso2);
                    break;

                case 3:
                    matricularCurso(curso3);
                    break;
            }
            if (existenPlazas()) {
                curso = Numero.pedirNumero("Introduce curso", -1, 3);
            }
        }
    }

    public boolean existenPlazas() {
        boolean resultado;
        int total;
        total = curso1.disponibilidad() + curso2.disponibilidad() + curso3.disponibilidad();
        if (total > 0) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;

    }

    public void informe() {
        System.out.println("\t\t Numero de alumnos \t edad media \t Porcentaje");

        System.out.println("curso1" + curso1.getOcupadas() + "\t" + curso1.edadMedia()
                + "\t" + curso1.porcentaje());

        System.out.println("curso2" + curso2.getOcupadas() + "\t" + curso2.edadMedia()
                + "\t" + curso2.porcentaje());

        System.out.println("curso3" + curso3.getOcupadas() + "\t" + curso3.edadMedia()
                + "\t" + curso3.porcentaje());

        System.out.println(("Total ocupacion \t\t" + "\t" + curso1.getOcupadas() + "\t"
                + curso2.getOcupadas() + "\t" + curso3.getOcupadas()));
    }

}
