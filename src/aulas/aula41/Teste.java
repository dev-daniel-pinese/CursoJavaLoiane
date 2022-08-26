package aulas.aula41;

public class Teste {
    public static void main(String[] args) {

    //Pessoa pessoa = new Pessoa()
    //criou uma classe pessoa do tipo aluno
    Pessoa aluno = new Aluno();
        //criou uma classe pessoa do tipo professor
    Pessoa professor = new Professor();

    //pessoa.setEndereco("Rua 1, num 1");
    aluno.setEndereco("Rua 2, num 2");
    professor.setEndereco("Rua 3, num 3");

    //System.out.println(aluno.obterEtiquetaEndereco());
    //System.out.println(professor.obterEtiquetaEndereco());

        //imprimirEtiquetaEndereco do tipo pessoa vai printar
    aluno.imprimirEtiquetaEndereco();
    //imprimirEtiquetaEndereco do tipo professor vai printar
    professor.imprimirEtiquetaEndereco();
 }
}
