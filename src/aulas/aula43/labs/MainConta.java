package aulas.aula43.labs;

import java.util.Locale;
import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /*
        usa os metodos da classe conta
        polimorfismo e classe
        Conta conta = new ContaCorrente("gabriel", 1234, 500.00, 1000.00);
        System.out.println(conta);
        System.out.println("quanto voce quer sacar?");
        double v1 = scan.nextDouble();
        conta.sacar(v1);
        System.out.println("quanto voce quer sacar?");
        double v2 = scan.nextDouble();
        conta.sacar(v2);
        System.out.println("quanto voce quer depositar?");
        double v3 = scan.nextDouble();
        conta.depositar(v3);
        System.out.println("quanto voce quer depositar?");
        double v4 = scan.nextDouble();
        conta.depositar(v4);*/

        ContaPoupanca contap = new ContaPoupanca("daniel", 2354, 500.00, 3);
        System.out.println(contap);
        //pq esse metodo épróprio da classe poupanca
        contap.rendimento(3);



    }
}
