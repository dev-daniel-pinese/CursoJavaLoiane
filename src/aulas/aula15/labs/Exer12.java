package aulas.aula15.labs;

import java.util.Scanner;

public class Exer12 { public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o valor/hora:");
    double valorHora = scan.nextDouble();

    System.out.println("Entre com as horas trabalhadas no mês:");
    double qtdHoras = scan.nextDouble();

    double salarioBruto = valorHora * qtdHoras;

    int percentualIR = 0;
    //se o salarioBruto for menor ou igual a 900
    if (salarioBruto <= 900){
        percentualIR = 0;
        //se nao se o salarioBruto for maior que 900 e menor ou igual a 1500
        //a porcentagem vai receber 5
    } else if (salarioBruto > 900 && salarioBruto <= 1500){
        percentualIR = 5;
        //se nao se o salarioBruto for maior que 1500 e menor ou igual a 2500
        //a porcentagem vai receber 10
    } else if (salarioBruto > 1500 && salarioBruto <= 2500){
        percentualIR = 10;
        //se nao se o salarioBruto for maior que 2500
        //a porcentagem vai receber 20
    } else if (salarioBruto > 2500){
        percentualIR = 20;
    }

    double ir = (salarioBruto / 100) * percentualIR;
    double inss = (salarioBruto / 100) * 10;
    double fgts = (salarioBruto / 100) * 11;
    double totalDescontos = ir + inss;
    double salarioLiquido = salarioBruto - totalDescontos;

    System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + "): " + salarioBruto);
    System.out.println("(-) IR (" + percentualIR + "%):" + ir);
    System.out.println("(-) INSS ( 10%): " + inss);
    System.out.println("FGTS (11%): " + fgts);
    System.out.println("Total de descontos: " + totalDescontos);
    System.out.println("Salário Liquido: " + salarioLiquido);
}
}
