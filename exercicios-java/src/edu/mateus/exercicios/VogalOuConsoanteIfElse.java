package edu.mateus.exercicios;

public class VogalOuConsoanteIfElse {
    public static void main (String [] args) {
        String letra = "e";

        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
            System.out.println("A letra digitada é uma vogal");
        } else {
            System.out.println("A letra digitada é uma consoante");
        }
    }
}
