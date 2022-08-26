package aulas.aula15.labs;

import java.util.Scanner;

public class Exer05 { public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com a primeira nota");
    double nota1 = scan.nextDouble();

    System.out.println("Entre com a segunda nota");
    double nota2 = scan.nextDouble();

    double media = (nota1 + nota2) / 2;

    //se a media vor igual a 10 vai printar
    if (media == 10){
        System.out.println("Aprovado com distinção");
        //se nao se a media vor maior ou igual 7
    } else if (media >= 7){
        System.out.println("Aprovado");
        //se nao
    } else {
        System.out.println("Reprovado");
    }
}
}
