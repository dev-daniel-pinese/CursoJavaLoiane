package aulas.aula43;

public class Professor {
    private double salario;
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

    public double calcularSalarioLiquido() {
        //vai retorna 0
        return 0;
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereço do Professor: ";
        //s += super.getEndereco();

        //vai returna A variavel S
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {

        //vai print
        System.out.println("Imprimindo endereço do Professor");
        //estara se referindo a um atributo fora do metodo e vai printar
        System.out.println(this.obterEtiquetaEndereco());

    }
}
