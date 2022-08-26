package aulas.aula15.labs;

import java.util.Scanner;

public class Exer06 {public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com primeiro número:");
    int num1 = scan.nextInt();

    System.out.println("Entre com segundo número:");
    int num2 = scan.nextInt();

    System.out.println("Entre com terceiro número:");
    int num3 = scan.nextInt();

    //se o numero 1 for maior ou igual a l numero 2 e numero 1 maior que o numero 3
    if (num1 >= num2 && num1 >= num3){
        System.out.println("num1 é maior: " + num1);
        //se nao se o numero 2 for maior ou igual a l numero 1 e numero 2 maior que o numero 3
    } else if (num2 >= num1 && num2 >= num3){
        System.out.println("num2 é maior: " + num2);
        //se nao se o numero 3 for maior ou igual a l numero 1 e numero 3 maior que o numero 2
    } else if (num3 >= num1 && num3 >= num2){
        System.out.println("num3 é maior: " + num3);
    }
}
}
