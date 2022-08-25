package aulas.aula15.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //vai printar
        System.out.println("Entre com um número:");
        //a variavel sera scaneada
        int num = scan.nextInt();

        //se o num for maior ou igual 0
        if (num >= 0){
            //vai printar
            System.out.println("O número informado é positivo");
            //se nao
        } else {
            //se nao vai printar
            System.out.println("O número informado é negativo");
        }
    }
}