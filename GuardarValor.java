import java.util.Scanner;

public class GuardarValor {
    public static void main (String[] args) {
        String pessoa;
        Scanner exemplo = new Scanner (System.in);
        System.out.println("Escreva seu nome: ");
        pessoa = exemplo.nextLine ( );

        System.out.println("Ola, "+ pessoa + ". Seja bem vindo!");
    }
}
    
