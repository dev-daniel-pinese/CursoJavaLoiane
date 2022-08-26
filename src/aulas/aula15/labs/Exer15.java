package aulas.aula15.labs;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o lado 1:");
        int lado1 = scan.nextInt();

        System.out.println("Entre com o lado 2:");
        int lado2 = scan.nextInt();

        System.out.println("Entre com o lado 3:");
        int lado3 = scan.nextInt();

        //se lado 1 + o lado 2 for maior que o lado 3 ou
        //lado + lado3 for maior que o lado 2 ou
        //ldo 2 + o lado 3 for maior que o lado 1
        if (((lado1 + lado2) > lado3) ||
                ((lado1 + lado3) > lado2) ||
                ((lado2 + lado3) > lado1)){

            //se lado 1 for igual ao lado 2 e lado 1 igual ao lado 3 e lado 2 igual lado 3
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
                //se nao se lado 1 for diferente do lado 2 e lado 1 diferente ao lado 3 e lado 3 diferente ao lado2
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Triângulo Escaleno");
                //se nao se lado 1 for igual ao lado 2 ou lado 1 igual ao lado 3 ou lado 2 igual lado 3
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo Isóceles");
            }

        } else {
            System.out.println("não forma um triângulo");
        }
    }
}
