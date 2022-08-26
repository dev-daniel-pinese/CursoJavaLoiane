package aulas.aula41;

public  class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    //setCurso vai dar um valor ao curso
    public void setCurso(String curso) {
        this.curso = curso;
    }
    //getCurso vai puxar o curso
    public String getCurso() {

        return curso;
    }
    //setNotas vai dar um valor ao notas
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer() {
        //vai pegar o atributo cpf da classe mae e vai printar ele
        super.setCpf("345345345354");

        //estara se referindo a um atributo fora do metodo
        this.setCpf("34534534");
    }

    //obterEtiquetaEndereco returna o S
    public String obterEtiquetaEndereco(){

        String s = "Endereço do Aluno: ";
        s += super.getEndereco();

        return s;
    }
    //imprimirEtiquetaEndereco sera printado
    public void imprimirEtiquetaEndereco() {

        System.out.println(this.obterEtiquetaEndereco());

    }
}
