package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar Entre com a temperatura em farenheit
        System.out.println("Entre com a temperatura em Farenheit:");
        //a variavel f sera scaneada
        double f = scan.nextDouble();

        //a variavel c recebera 5 * o resutado de f - 32 / 9
        double c = (5 * (f-32) / 9);

        //ira printar "A temperatura " e mostrara o resultado de f
        //e ira printar de novo " F é igual a " e mostrara o resultado de c e printara "c"
        System.out.println("A temperatura " + f + " F é igual a " + c + " C");
    }
}