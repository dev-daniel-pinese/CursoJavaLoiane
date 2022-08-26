package aulas.aula16;

public class Loop {
    public static void main(String[] args) {

        int i = 1; //count ou cont
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++; // i = i + 1; ou i += 1;
        }

        System.out.println(i); //valor de 11

        //o comeco do loop
        do {
            i++;
            System.out.println("Valor de i: " + i);
            //se o i for menor que 13 o loop par
        } while (i < 13);


        System.out.println(i);
    }

}