public class RegistroTrabalho {
    String data = "22/04/2002";
    int cargaHoraria = 2;
    String local = "casa";

    Usuario usuario = new Usuario();

   public void registrarData (String novaData) {
        data = novaData;
        System.out.println("O usuário " + usuario.nome + " fez um registro para a data: " + data );
        

   }

   public void registrarCargaHoraria (int novaCargaHoraria) {
         cargaHoraria = novaCargaHoraria;
         System.out.println("O usuário " + usuario.nome + " fez um registro para a cargaHoraria: " + cargaHoraria + " horas" );

   }


   public void  mudarlocal (String novolocal) {
        local = novolocal;
        System.out.println("O usuário " + usuario.nome + " fez um registro para um novo local: " + local );

   }

   public static void main (String [] args) {
     

   }



}