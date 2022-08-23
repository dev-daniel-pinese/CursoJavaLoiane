package aulas.aula39;
//a Classe aluno vai erda todos os atributos da classe e pessoa

public class Aluno extends Pessoa {

    //o curso é uma variavel string
    private String curso;
    //a notas é uma variavel double e tambem é um vetor
    private double[] notas;

    public void verificarAcesso(){

        //estara se referindo ao atributo fora do metodo
        this.nomeVisibilidade = "sesdfsdf";
        //vai pegar o atributo da classe mae
        super.nomeVisibilidade = "sefsdfsdf";
        //estara se referindo ao atributo fora do metodo
        this.setNomeVisibilidade("sesdfsdf");
    }

    //vai usar o costrutor da classe mae
    public Aluno() {
        super();
    }

    //vai pegar todos os atributos da classe mae
    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

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
    public double calcularMedia() {
        return 0;
    }
    //vai verificar se é aprovado e retonara true
    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        //vai pegar o atributo cpf da classe mae e vai printar ele
        super.setCpf("345345345354");

        //estara se referindo a um atributo fora do metodo
        this.setCpf("34534534");
    }
}
