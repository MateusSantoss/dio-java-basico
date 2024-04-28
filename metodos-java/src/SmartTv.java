public class SmartTv {
    boolean ligada = false;
    String marca = "Philco";
    int canal = 0;
    int volume = 25;

    public void ligar () {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;

    }

    public void aumentarCanal () {
        canal++;
    
    }

    public void diminuircanal() {
        canal--;
    }

    public void aumentarVolume () {

        volume++;
        System.out.println("Aumentar volume para: " + volume);
    }

    public void diminuirVolume () {
        volume--;
        System.out.println("Diminuir volume para: " + volume);
    }
    public static void main (String [] args) {

    

    }
}