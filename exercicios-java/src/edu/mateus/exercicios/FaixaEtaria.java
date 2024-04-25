package edu.mateus.exercicios;

public class FaixaEtaria {
    public static void main (String [] args) {
        int idade = 12;

        if (idade  > 0 && idade <= 11) {
            System.out.println("Criança");
        } else if (idade  <= 17) {
            System.out.println("Adolescente");

        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
