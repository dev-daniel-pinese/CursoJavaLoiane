package aulas.aula46.Exer01;

public class Quadrado extends Figura2D {
    private int lado;

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    public double caucularArea() {
        return Math.pow(lado, 2);
    }
}
