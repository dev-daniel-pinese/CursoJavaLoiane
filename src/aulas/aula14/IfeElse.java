package aulas.aula14;

import java.util.Scanner;

public class IfeElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //vai printar
        System.out.println("Entre com o preço do item");
        //a variavel valor sera scaneda
        double valor = scan.nextDouble();

        //vai ver se é menor ou igual a 10
        if (valor <= 10){
            //se vor menor ou igual 10 vai printar
            System.out.println("Está barato, pode comprar");
            //e se nao vor aquilo vai se isso se vor maior que 10 e menor que 15
        } else if (valor > 10 && valor < 15){
            //se vor maior que 10 e monor que 15 vai printar
            System.out.println("Você pode pedir um desconto");
            //se nao se for menor ou igual 15 e menor que 17
        } else if (valor >=15  && valor < 17){
            //se vor maior ou igual 15 e menor que 17
            System.out.println("Pode pesquisar mais");
        } /*else { // valor >= 17
			Syste
		}*/
    }

}

