package aulas.aula15.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //vai printar
        System.out.println("Entre com uma letra (F ou M):");
        String input = scan.next();

        //se input for iqual igonarando maisculo ou minusculo "f"
        //metodo equalsIgnoreCase da classe String
        if (input.equalsIgnoreCase("f")){
            System.out.println("F - feminino");
            //se input for iqual igonarando maisculo ou minusculo "M"
            //metodo equalsIgnoreCase da classe String
        } else if (input.equalsIgnoreCase("m")){
            System.out.println("M - masculino");
            //vai ver se nao é
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
