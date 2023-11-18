package aulas.aula43.refazendoozinhosemcopiar;

import aulas.aula43.labs.Conta;
import aulas.aula43.labs.ContaCorrente;
import aulas.aula43.labs.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente("gabriel", 1234, 500.00, 1000.00);
        conta.sacar(200);
        conta.depositar(700);
        conta.sacar(400);
        System.out.println(conta);

        Conta contaa = new ContaPoupanca("daniel",2354,500.00,3);
        System.out.println(contaa);
        ((ContaPoupanca) contaa).rendimento();
        System.out.println(((ContaPoupanca) contaa).rendimento());
    }
}
