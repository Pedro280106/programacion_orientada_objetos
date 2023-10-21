package com.poo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.poo.model.Correo;
import com.poo.model.Estudiante;
import com.poo.model.Materia;
import com.poo.model.Password;
import com.poo.service.IEstudianteService;
import com.poo.service.impl.EstudianteServiceImpl;

public class App {
    public static void main(String[] args) throws Exception {

       /* IEstudianteService iEstudianteService = new EstudianteServiceImpl(); */
       
       /*  Persona persona = new Persona("Pedro", "Masculino", "2006-01-28");
       System.out.println(persona); */

       /* Estudiante estudiante = new Estudiante("Pedro", "Masculino", "2006-01-28", "ceduk", "Ingeneria en sistemas", 4, 9569);

       List<Materia> materias = new ArrayList<Materia>();

       Materia matematicas = new Materia("Matematicas", 9.0);
       Materia espanol = new Materia("Español", 8.0);
       Materia ingles = new Materia("Ingles", 7.7);
       
       materias.add(matematicas);
       materias.add(espanol);
       materias.add(ingles);

       estudiante.setPromedio(iEstudianteService.promedioFinal(materias));
       
       System.out.println(estudiante); */

       /* String texto = JOptionPane.showInputDialog("Introduce un tamaño para el arrey");
       int tamanio = Integer.parseInt(texto);

       texto = JOptionPane.showInputDialog("introduce la longitud de password");
       int longitud = Integer.parseInt(texto);

       Password listaPasswords[] = new Password[tamanio];
       boolean fortalezaPassword[] = new boolean[tamanio];

       for (int i = 0; i < listaPasswords.length; i++) {
        listaPasswords[i] = new Password(longitud);
        fortalezaPassword[i] = listaPasswords[i].esFuerte();
        System.out.println(listaPasswords[i].getContrasenia() + " " + fortalezaPassword[i]);
       } */

       String nombre = JOptionPane.showInputDialog("Cual es su nombre?");
       String apellido = JOptionPane.showInputDialog("Cual es su apellido?");
       String compania = JOptionPane.showInputDialog("A que compañia perteneces");

       Password password = new Password(12);
       Correo correo = new Correo(nombre, apellido, compania, password.getContrasenia());

       System.out.println(correo);
       
    }
    
}