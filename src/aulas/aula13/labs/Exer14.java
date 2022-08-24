package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar
        System.out.println("Entre com o tamanho do arquivo:");
        //a variavel sera scaneada
        double tamArquivo = scan.nextDouble();

        //vai printar
        System.out.println("Entre com a velocidade da internet:");
        //a variavel sera scaneada
        double velInternet = scan.nextDouble();

        //a variavel recebera tamanho do arquivo / internet
        double tempo = tamArquivo / velInternet;

        //vai printar
        System.out.println("Entre com o tamanho do arquivo / internet: " + tempo);
    }
}
