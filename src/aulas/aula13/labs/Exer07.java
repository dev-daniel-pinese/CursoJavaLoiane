package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar Entre com o tamanho  do lado do quadrado
        System.out.println("Entre com o tamanho do lado do quadrado:");
        //a variavel lado sera scaneada
        double lado = scan.nextDouble();

        //a variavel area recebera lado vezes ele mesmo
        double area = Math.pow(lado, 2);

        //ira printar"A área do quadrado é"e mostrara a area
        System.out.println("A área do quadrado é: " + area);
        //vai printar "O dobro da área do quadrado é" e mostrara a area vezes 2
        System.out.println("O dobro da área do quadrado é: " + (area * 2));
    }
}
