package aulas.aula42;

//a classe aluno nao pode estender a classe pessoa
public class Aluno {
    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    //vai pegar todos os atributos da classe mae
    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
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
            //super.setCpf("345345345354");
        //estara se referindo a um atributo fora do metodo
            //this.setCpf("34534534");
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereço do Aluno: ";
        //s += super.getEndereco();

        //vai retorna o endereco S
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {

        //estara se referindo a um atributo fora do metod e vai printar
        System.out.println(this.obterEtiquetaEndereco());

    }
}
