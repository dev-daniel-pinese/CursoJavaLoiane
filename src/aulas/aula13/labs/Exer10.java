package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar "Entre com a temperatura em Celsius:"
        System.out.println("Entre com a temperatura em Celsius:");
        //a variavel c sera scaneada
        double c = scan.nextDouble();

        //a variavel f ira receber o resultado de (c * 1.8) +32
        double f = (c * 1.8) + 32;

        //ira printar "A temperatura "e mostrara o resultado de c " C é igual a "
        //e mostrara o resultado de f
        System.out.println("A temperatura " + c + " C é igual a " + f + " F");
    }
}