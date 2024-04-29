import java.util.Scanner;
import java.util.Locale;
public class ResultadoEscolar {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        

        if (media >= 7) {
            System.out.println("Aprovado a sua média é: " + media);
        } else {
            System.out.println("Reprovado a sua média é: " + media);
        }


    }
}
