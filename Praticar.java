import java.util.Scanner;

import javax.print.attribute.standard.Media;
public class Praticar {
    public static void main (String[] args){
        Double nota1, nota2, nota3;
        Scanner valor = new Scanner (System.in);
        System.out.println("Digite sua nota HTML:");
        nota1 = valor.nextDouble();
        System.out.println("Digite sua nota CSS:");
        nota2 = valor.nextDouble();
        System.out.println("Digite sua nota JAVA:");
        nota3 = valor.nextDouble();

        Double media = ((nota1+nota2+nota3)/3);
        System.out.println("A Sua nota foi:"+ media);

        if (media < 7 ){
            System.out.println("Voce foi reprovado");
        } else{
            System.out.println("Voce foi aprovado");
        }
    };
}; 
