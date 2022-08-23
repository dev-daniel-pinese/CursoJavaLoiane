package aulas.aula37.exemplo01;

//a Classe professor erda todos os atributos da classe pessoa
public class Professor extends Pessoa {

    //a salario é uma variavel double
    private double salario;
    //a nomeCurso é uma variavel double
    private String nomeCurso;

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

    public double calcularSalarioLiquido(){
        return 0;
    }

}