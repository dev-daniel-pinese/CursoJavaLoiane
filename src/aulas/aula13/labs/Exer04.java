package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar Entre com a primeira nota
        System.out.println("Entre com a primeira nota");
        //a variavel nota1 sera scaneada
        double nota1 = scan.nextDouble();

        //vai printar Entre com a segunda nota
        System.out.println("Entre com a segunda nota");
        //a variavel nota2 sera scaneada
        double nota2 = scan.nextDouble();

        //vai printar Entre com a terceira nota
        System.out.println("Entre com a terceira nota");
        //a variavel nota3 sera scaneada
        double nota3 = scan.nextDouble();

        //vai printar Entre com a quarta nota
        System.out.println("Entre com a quarta nota");
        //a variavel nota4 sera scaneada
        double nota4 = scan.nextDouble();

        //a variavel media ira receber todas as notas somalas e dividir
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        //vai printar "a media é" e ira aparecer a media
        System.out.println("A média é: " + media);
    }
}
