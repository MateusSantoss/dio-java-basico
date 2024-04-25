package edu.mateus.segundasemana;
public class MinhaClasse {
    public static void main (String [] args) {
        //
       String primeiroNome = "Mateus";
       String segundoNome = "Santos";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

       System.out.println(nomeCompleto);


    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "resultado do médtodo agora é: " + primeiroNome.concat("").concat(segundoNome);

    }
    
}
