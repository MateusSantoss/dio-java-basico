public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        String estadoTv = "Desligada";
        smartTv.ligada = true;

        System.out.println("O volume atual é: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        if (smartTv.ligada) {
            estadoTv = "Ligada";
        }

        System.out.println("A tv está: " + estadoTv);
        System.out.println("O canal atual da tv é: " + smartTv.canal);
        System.out.println("O volume atual da sua tv é: " + smartTv.volume);

        smartTv.mudarCanal(12);

        System.out.println("Você mudou de canal, o canal atual é: " + smartTv.canal);
    }
}
