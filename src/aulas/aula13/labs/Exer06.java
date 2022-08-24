package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //ira printar "Entre com o raio do círculo"
        System.out.println("Entre com o raio do círculo:");
        //a variavel raip sera scaneada
        double raio = scan.nextDouble();

        //a variavel area ira receber o valor de pi que ele pode ou
        //voutar um valor * pow  é usado para calcular um aumento de número à potência de algum outro número
        //(raio com apotencia de 2)
        double area = Math.PI * Math.pow(raio, 2);

        //vai printar "a area do círculo é:" e aparecera a area do círculo
        System.out.println("A área do círculo é: " + area);
    }
}
