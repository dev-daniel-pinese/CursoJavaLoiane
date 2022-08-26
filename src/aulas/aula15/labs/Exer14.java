package aulas.aula15.labs;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        String aproveitamento = "";
        //se a media for 9 e 10
        if (media >= 9 && media <= 10){
            aproveitamento = "A";
            //se nao se a media for 7.5 e 9
        } else if (media >= 7.5 && media < 9){
            aproveitamento = "B";
            //se nao se a media for 6 e 7.5
        } else if (media >= 6 && media < 7.5){
            aproveitamento = "C";
            //se nao se a media for 4 e 6
        } else if (media >= 4 && media < 6){
            aproveitamento = "D";
            //se nao se a media for 0 e 4
        } else if (media >= 0 && media < 4){
            aproveitamento = "E";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + aproveitamento);

        //outro exemplo para a media
        switch(aproveitamento){
            case "A":
            case "B":
            case "C": System.out.println("APROVADO"); break;
            case "D":
            case "E": System.out.println("REPROVADO"); break;
        }
    }
}
