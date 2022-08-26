package aulas.aula15.labs;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário:");
        double salario = scan.nextDouble();

        int percentual = 0;
        //se o salari for meno ou igual a 280 a percentual vai receber 20
        if (salario <= 280){
            percentual = 20;
            //se nao se o salari for maior a 280 e menor que 700 a percentual vai receber 15
        } else if (salario > 280 && salario < 700){
            percentual = 15;
            //se nao se o salari for maior a 700 e menor que 1500 a percentual vai receber 10
        } else if (salario >= 700 && salario < 1500){
            percentual = 10;
            //se nao se o salari for maior ou igual a 1500 a percentual vai receber 5
        } else if (salario >= 1500){
            percentual = 5;
        }

        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;

        System.out.println("Salário: " + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salário ajustado: " + salarioAjustado);
    }
}
