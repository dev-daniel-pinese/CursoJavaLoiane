package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer02 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar Entre com um número inteiro
        System.out.println("Entre com um número inteiro:");
        //vai escanear
        int numero = scan.nextInt();
        //vai printar O número information foi e ira aprecer o numero informado
        System.out.println("O número information foi: " + numero);
    }
}