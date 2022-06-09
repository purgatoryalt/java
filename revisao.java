import java.util.Scanner;  
  
  public class revisao {
      public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escreva seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Ola, seja bem-vindo! "+ nome);

        System.out.println("============");

        System.out.println(nome + ", Escreva a sua nota de HTML:");
        Double nota1 = entrada.nextDouble();
        Double nota = nota1+0.5;
        System.out.println("Sua media foi:" + nota);

      }

}     