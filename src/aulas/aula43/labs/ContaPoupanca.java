package aulas.aula43.labs;

public class ContaPoupanca extends Conta {
    private int diaRendimento;


    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(String nome, Integer num, Double saldo, int diaRendimento) {
        super(nome, num, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean rendimento(int diaRendimento) {

        for (int i = 1; i <= diaRendimento; i++) {
            //setSaldo atribui, coloca um valor no saldo com o valor do getSaldo()
            //getSaldo pega o atual saldo
            //mais o valor do saldo atual divido pro 100
            setSaldo(getSaldo() + (getSaldo() / 100));
            System.out.println("valor rendiamento diario: " + i + "º " + getSaldo());
        }

        System.out.println("Rendimento acumulado em "+diaRendimento+" dia(s) " + getSaldo());
        return true;

    }

    @Override
    public String toString() {
        return "ContaPoupanca " + super.toString() +
                ", diaRendimento=" + getSaldo();
    }
}
