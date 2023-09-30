package com.poo;

import com.poo.model.Persona;

public class App {
    public static void main(String[] args) throws Exception {
       Persona persona = new Persona(1, "Pedro", "Masculino", "1976-04-19", false);
       System.out.println(persona);
    }
    
    
}