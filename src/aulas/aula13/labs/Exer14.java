package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo:");
        double tamArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet:");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de download: " + tempo);
    }
}
