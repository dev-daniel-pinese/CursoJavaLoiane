package aulas.aula15.labs;

import java.util.Scanner;

public class Exer13 { public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com um dia da semana (1-7):");

    int diaSemana = scan.nextInt();

    switch (diaSemana) {
        //se for 1 domingo
        case 1:
            System.out.println("Domingo");
            break;
        //se for 2 Segunda
        case 2:
            System.out.println("Segunda");
            break;
        //se for 3 Terça
        case 3:
            System.out.println("Terça");
            break;
        //se for 4 Quarta
        case 4:
            System.out.println("Quarta");
            break;
        //se for 5 Quinta
        case 5:
            System.out.println("Quinta");
            break;
        //se for 6 Sexta
        case 6:
            System.out.println("Sexta");
            break;
        //se for 7 sábado
        case 7:
            System.out.println("Sábado");
            break;
            //se nao for nenhum
        default:
            System.out.println("Não é uma dia da semana válido");
    }
}
}
