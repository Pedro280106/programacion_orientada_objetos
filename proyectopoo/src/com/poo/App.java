package com.poo;

import java.util.ArrayList;
import java.util.List;

import com.poo.model.Estudiante;
import com.poo.model.Materia;
import com.poo.service.IEstudianteService;
import com.poo.service.impl.EstudianteServiceImpl;

public class App {
    public static void main(String[] args) throws Exception {

        IEstudianteService iEstudianteService = new EstudianteServiceImpl();
       
       /*  Persona persona = new Persona("Pedro", "Masculino", "2006-01-28");
       System.out.println(persona); */

       Estudiante estudiante = new Estudiante("Pedro", "Masculino", "2006-01-28", "ceduk", "Ingeneria en sistemas", 4, 9569);

       List<Materia> materias = new ArrayList<Materia>();

       Materia matematicas = new Materia("Matematicas", 9.0);
       Materia espanol = new Materia("Español", 8.0);
       Materia ingles = new Materia("Ingles", 7.7);
       
       materias.add(matematicas);
       materias.add(espanol);
       materias.add(ingles);

       estudiante.setPromedio(iEstudianteService.promedioFinal(materias));
       
       System.out.println(estudiante);
       
    }
    
}