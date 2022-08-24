package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar "Entre com a altura"
        System.out.println("Entre com a altura");
        //a variavel altura sera scaneada
        double altura = scan.nextDouble();

        //a variavel pessoaIdeal ira receber o resultado da altura(72.2 * altura) - 58
        double pesoIdeal = (72.7 * altura) - 58;

        //vai printar e aparecera a conta
        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}