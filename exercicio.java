import java.util.Scanner;

public class exercicio {
    public static void main (String[] args){
        Scanner exercicio = new Scanner (System.in);

        System.out.println("Digite um numero:");
        Double nome = exercicio.nextDouble();
        
        System.out.println("Outro:");
        Double nome1 = exercicio.nextDouble();
        Double resultado = ((nome+nome1));

        System.out.println("A soma e: " + resultado);



/////////////////////////////////////////////////////////////////
System.out.println("==================================================");

    
        System.out.println("Digite em metros:");
        Double metro = exercicio.nextDouble();
        Double centrimetros = metro*100;

        System.out.println("Centimetros: " + centrimetros);

////////////////////////////////////////////////////////////////
System.out.println("=================================================");
        System.out.println("Digite um numero: ");
        Double numero = exercicio.nextDouble();
        if (numero % 2 == 0){
            System.out.println("Esse numero e Par");
        } else{
            System.out.println("Esse numero e Impar");
        }


///////////////////////////////////////////////////////////////
System.out.println("=================================================");
System.out.println("Digite o km do seu automovel: ");
        Double km = exercicio.nextDouble();
        if (km >= 80){
            Double multa = (km - 80) * 5;
            System.out.println("Voce ultrapassou o limite, pague: " + multa );

        }else{
            System.out.println("Voce esta no limite!");
        }

};
};


