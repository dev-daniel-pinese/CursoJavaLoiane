package aulas.aula43.refazendoozinhosemcopiar;

public abstract class Conta {
    private String nome;
    private Integer num;
    private double saldo;

    public Conta() {
    }

    public Conta(String nome, Integer num, double saldo) {
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean sacar(double saque){
        if(saldo <= saque){
            return false;
        }
        if (saldo >= saque){
            saldo-=saque;
            return true;
        }
        return false;
    }

    public boolean depositar(double deposito){

        saldo+=deposito;
        return true;
    }

    public abstract boolean depocitar(double deposito);

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", num=" + num +
                ", saldo=" + saldo +
                '}';
    }

}
