package aulas.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        //vai printar
        System.out.println("Entre com o valor/hora");
        //a variavel sera scaneada
        double valorHora = scan.nextDouble();

        //vai pritar
        System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
        //a variavel sera scaneada
        double horas = scan.nextDouble();

        //a variavel recebera o valor/hora * horas
        double salarioBruto = valorHora * horas;
        //a variavel recebera o resutado do (salarioBruto / 100 ) * 8
        double inss = (salarioBruto / 100) * 8;
        //a variavel recebera o(salarioBruto / 100 ) * 5
        double sindicato = (salarioBruto / 100) * 5;
        //a variavel recebera o(salarioBruto / 100 ) * 11
        double ir = (salarioBruto / 100) * 11;
        //a variavel recebera o inss + sindicato + ir
        double totalDescontos = inss + sindicato + ir;
        //a variavel recebera o salarioBruto - totalDescontos
        double salarioLiquido = salarioBruto - totalDescontos;

        //vai printar e mostra
        System.out.println("Salário bruto: " + salarioBruto);
        //vai printar e mostra
        System.out.println("INSS: " + inss);
        //vai printar e mostra
        System.out.println("Sindicato: " + sindicato);
        //vai printar e mostra
        System.out.println("IR: " + ir);
        //vai printar e mostra
        System.out.println("Total descontos: " + totalDescontos);
        //vai printar e mostra
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}