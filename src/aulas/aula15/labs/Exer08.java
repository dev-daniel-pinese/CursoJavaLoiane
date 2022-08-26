package aulas.aula15.labs;

import java.util.Scanner;

public class Exer08 {public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com primeiro preço:");
    double preco1 = scan.nextDouble();

    System.out.println("Entre com segundo preço:");
    double preco2 = scan.nextDouble();

    System.out.println("Entre com terceiro preço:");
    double preco3 = scan.nextDouble();

    //se o preco 1 for menor ou igual a l preco 2 e preco 1 menor que o preco 3
    if (preco1 <= preco2 && preco1 <= preco3){
        System.out.println("Compre o produto 1");
        //se nao se o preco 2 for menor ou igual a l preco 1 e preco 2 menor que o preco 3
    } else if (preco2 <= preco1 && preco2 <= preco3){
        System.out.println("Compre o produto 2");
        //se nao se o preco 3 for menor ou igual a l preco 1 e preco 3 menor que o preco 2
    } else if (preco3 <= preco1 && preco3 <= preco2){
        System.out.println("Compre o produto 3");
    }
}
}
