package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar "Entre com o valor/hora"
        System.out.println("Entre com o valor/hora");
        //a variavel VALORHORA sera scaneada
        double valorHora = scan.nextDouble();

        //vai printar "Entre com a quantidade de horas trabalhadas no mês"
        System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
        //a variavel hora sera scaneada
        double horas = scan.nextDouble();

        //a variavel salario ira receber o valorhora vezes horas
        double salario = valorHora * horas;

        //vai printar "O salário é de " e aparecera salario
        System.out.println("O salário é de: " + salario);
    }
}
