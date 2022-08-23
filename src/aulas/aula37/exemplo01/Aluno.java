package aulas.aula37.exemplo01;
//a Classe aluno vai erda todos os atributos da classe e pessoa

public class Aluno extends Pessoa {

    //o curso é uma variavel string
    private String curso;

    //a notas é uma variavel double e tambem é um vetor
    private double[] notas;

    //getCurso vai puxar o curso
    public String getCurso() {
        return curso;
    }
    //setCurso vai dar um valor ao curso
    public void setCurso(String curso) {
        this.curso = curso;
    }
    //getNotas vai puxar o notas
    public double[] getNotas() {
        return notas;
    }
    //setNotas vai dar um valor ao notas
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    //vai caucular a media e retornara 0
    public double calcularMedia(){
        return 0;
    }
    //vai verificar se é aprovado e retonara true
    public boolean verificarAprovado(){
        return true;
    }
}
