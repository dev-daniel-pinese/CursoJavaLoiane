package aulas.aula15.labs;

import java.util.Scanner;

public class Exer01 {public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    //vai printar
    System.out.println("Entre com o primeiro número");
    //a variavel num1 sera scaneada
    int num1 = scan.nextInt();
    //vai printar
    System.out.println("Entre com o segundo número");
    //a variavel num2 sera scaneada
    int num2 = scan.nextInt();

    //se num1 for maior que o segundo
    if (num1 > num2) {
        //vai printar
        System.out.println("O num1 é maior: " + num1);
        //SE NAO
    } else {
        //vai printar esse
        System.out.println("O num2 é maior: " + num2);
    }
}
}