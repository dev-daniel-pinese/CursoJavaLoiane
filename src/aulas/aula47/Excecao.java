package aulas.aula47;

public class Excecao {
    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("antes da exceptin");

            vetor[4] = 1;

            System.out.println("Erro");

        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("excecao do texto");
        }
    }
}
