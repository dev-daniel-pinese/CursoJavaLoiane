package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar Entre com um numero inteiro
        System.out.println("Entre com um número inteiro");
        //a variavel num1 sera scaneada
        int num1 = scan.nextInt();

        //vai printar Entre com um outro numero inteiro
        System.out.println("Entre com um outro número inteiro");
        //a variavel num2  sera scaneada
        int num2 = scan.nextInt();

        System.out.println("Entre com um número real");
        double num3 = scan.nextDouble();

        //a variavel resultado1 ira receber o resultado (num1 * 2)*(num2/2)
        int resultado1 = (num1 * 2) * (num2 / 2);
        //a variavel resultado2 ira receber o resultado (num1 * 3)+ num3
        double resultado2 = (num1 * 3) + num3;
        //a variavel resultado1 ira receber o num3 vezes ele mesmo 3 vezes
        double resultado3 = Math.pow(num3, 3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}
