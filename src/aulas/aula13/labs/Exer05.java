package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar Entre com a quantidade de metros
        System.out.println("Entre com a quantidade de metros");
        //a variavel metros sera scaneada
        double metros = scan.nextDouble();

        //a variavel cm ira receber metros * 100
        double cm = metros * 100;

        //ira mostrar a quantidade de metros e ira printar "m é igual a" e mostrara os centimetros e ira printar"cm"
        System.out.println(metros + " m é igual a " + cm + " cm");

    }
}
