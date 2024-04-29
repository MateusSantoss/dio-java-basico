import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main (String [] args) {

        //criando o objeto scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();


        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();


        //imprimindo os daos
        System.out.println("Olá, me chamo " + nome + " " + sobrenome + " eu tenho  " + idade + " anos " + " e minha altura é: " + altura);
        

        
        




        
    }
}
