package com.poo.model;

public class Password {
    
    // Atributos

    private final static int LONG_DEF = 8;
    private int longitud;
    private String contrasenia;

    // Getters & Setter

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    // Constructores

    public Password() {
        this(LONG_DEF);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasenia = generaContrasenia();
    }

    // Metodos

    public String generaContrasenia(){
        String password = "";

        for (int index = 0; index < longitud; index++) {
            int eleccion = ((int)Math.floor(Math.random()*3+1));
            char character;

            if (eleccion == 1) {
                // Se asigna una letra minuscula
                character = (char)((int)Math.floor(Math.random()*(26)+97));
            } else if(eleccion == 2) {
                // Se asigna una letra mayuscula
                character = (char)((int)Math.floor(Math.random()*(26)+65));
            } else {
                // Se asigna un numero
                character = (char)((int)Math.floor(Math.random()*(10)+48));
            }

            password += character;

        }
        return password;
    }

    public boolean esFuerte(){
        int cuentaNumeros = 0;
        int cuentaMinusculas = 0;
        int cuentaMayusculas = 0;

        for (int index = 0; index < contrasenia.length(); index++) {
            if (contrasenia.charAt(index) >= 97 && contrasenia.charAt(index) <=122) {
                cuentaMinusculas += 1;
            } else if (contrasenia.charAt(index) >= 65 && contrasenia.charAt(index) <=90) {
                cuentaMayusculas += 1;
            } else {
                cuentaNumeros += 1;
            }
        }

        return (cuentaNumeros > 4 && cuentaMinusculas > 0 && cuentaMayusculas > 1);

    }
    
}
