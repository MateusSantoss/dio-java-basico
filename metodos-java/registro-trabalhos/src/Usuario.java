public class Usuario {
    int id = 1;
    String nome = "joão";
    String email = "msjt098@gmail.com";
    String senha = "57685";

    public static void main (String [] args) {
        RegistroTrabalho registro = new RegistroTrabalho();


        registro.registrarData("27/04/2024");
        registro.mudarlocal("são paulo");
        registro.registrarCargaHoraria(3);


        System.out.println("A data registrada foi: " + registro.data);
        System.out.println("O local registrado foi: " + registro.local);
        System.out.println("A carga horária registrada foi: " + registro.cargaHoraria);

    }
    
    
}