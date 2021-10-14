package com.generation;


public class Main {

    public static void main(String[] args) {
        String mensaje = saludar("Hugo Bruno");
        System.out.println(mensaje);
        int resultado = suma(5, 3);
        System.out.println(resultado);

    }

    public static String saludar(String nombre){
        return "Hola, como estas " + nombre;
    }

    public static int suma (int numero1, int numero2){
        return numero1 + numero2;
    }
    public static void alerta(String mensaje){
        System.out.println(mensaje);
    }
}
