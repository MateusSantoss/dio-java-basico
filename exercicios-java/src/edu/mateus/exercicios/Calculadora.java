package edu.mateus.exercicios;

public class Calculadora {
    public static void main (String [] args) {
        int numero = 11;

        if ((numero / 5 > 0) && (numero / 11 > 0)) {
            System.out.println("O numero é divisivel por 11 e por 5");

        } else {
            System.out.println("O numero não e divisivél por 11 ou por 5");
        }
    }

}