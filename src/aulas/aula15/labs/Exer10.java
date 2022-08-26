package aulas.aula15.labs;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno que você estuda:");
        String turno = scan.next();

        //switch case vai ver se é m, v ou n
        switch(turno){
            case "m":
            case "M": System.out.println("Bom dia!"); break;
            case "v":
            case "V": System.out.println("Boa tarde!"); break;
            case "n":
            case "N": System.out.println("Boa noite!"); break;
            default: System.out.println("Valor inválido");
        }
    }
}
