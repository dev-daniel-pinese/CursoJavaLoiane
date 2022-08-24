package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer03 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar Entre com o primeiro numero
        System.out.println("Entre com o primeiro número:");
        //vai scanear o numero1
        int num1 = scan.nextInt();
        //vai printar Entre com o segundo numero
        System.out.println("Entre com o segundo número:");
        //vai scanear o numero2
        int num2 = scan.nextInt();

        //a variavel resultado ira receber numero1 + numero2
        int resultado = num1 + num2;
        //vai printar O número information foi e ira aprecer o numero informado
        System.out.println("A soma dos números é: " + resultado);
    }
}
