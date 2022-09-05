package aulas.aula43.labs;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(String nome, Integer num, Double saldo, double limite) {
        super(nome, num, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    //polimorfimo em metodos
    //ta sobescrevendo o atributo sacar da classe conta
    @Override
    public boolean sacar(double saque) {
        //se o valor do saldo for maior ou igual ao sague
        //eu vo atribuir o valor do saldo com o resultado do saldo menos que o saque
        //e retornara true
        if (getSaldo()>=saque){
            setSaldo(getSaldo()-saque);
            System.out.println("voce sacou: "+saque+ " seu saldo é: "+getSaldo());
            return true;
        }
        double saldoComLimite = getSaldo() + limite;
        if (saldoComLimite >= saque) {
            saldoComLimite -= saque;
            //set vai atribuir o valor do saldo limite menos o limite
            setSaldo(saldoComLimite-limite);
            System.out.println("voce sacou: "+saque+"saldo atual: "+getSaldo()) ;
            System.out.println("voce usou o limite");
            return true;
        }
        System.out.println("saldo insuficiente");
        return false;
    }

    @Override
    public boolean depositar(double deposito) {
        //set vai atribuir o do saldo com o valor do saldo mais o valor do deposito
        setSaldo(getSaldo() + deposito);
        System.out.println("deposito efetuado: "+getSaldo());
        return true;
    }

    @Override
    public String toString() {
        return "ContaCorrente " + super.toString()+
                ", limite=" + limite ;
    }
}
