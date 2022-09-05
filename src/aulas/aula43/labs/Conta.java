package aulas.aula43.labs;

public abstract class Conta {
    private String nome;
    private Integer num;
    private Double saldo;

    public Conta() {
    }

    public Conta(String nome, Integer num, Double saldo) {
        this.nome = nome;
        this.num = num;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double saque) {
        //se o saldo menor ou igual ao saque vai retorna false
        if (saldo <= saque) {
            return false;
        }
        //se saque for maior ou igual que saque
        //saldo recebe ele mesmo menos que saque e retorna true
        if (saque >= saque) {
            saldo -= saque;
            return true;
        }
        return false;
    }


    public boolean depositar(double deposito) {
        //saldo vai receber ele mesmo mais o valor do deposito
        saldo += deposito;

        return true;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome +
                        ", num=" + num +
                        ", saldo=" + saldo;
    }
}
