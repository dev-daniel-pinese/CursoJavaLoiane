package aulas.aula39;

//a Classe professor erda todos os atributos da classe pessoa
public class Professor extends Pessoa {

    //a salario é uma variavel double
    private double salario;
    //a nomeCurso é uma variavel string
    private String nomeCurso;

    public void verificarAcesso() {

        //estara se referindo ao atributo fora do metodo
        this.nomeVisibilidade = "sesdfsdf";
        //vai pegar o atributo da classe mae
        super.nomeVisibilidade = "sefsdfsdf";
        //estara se referindo ao atributo fora do metodo
        this.setNomeVisibilidade("sesdfsdf");
    }

    //getSalario vai puxar o salario
    public double getSalario() {
        return salario;
    }

    //setSalario vai dar um valor ao salario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //getNomeCurso  vai puxar o nomeCurso
    public String getNomeCurso() {
        return nomeCurso;
    }

    //setNomeCurso vai dar um valor ao nomeCurso
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }
}