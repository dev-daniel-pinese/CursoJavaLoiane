package aulas.aula46.Exer01;

public class Cubo extends Figura3D{
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return 6 * (lado*lado);
    }

    public double calcularVolume() {

        return Math.pow(lado, 3);
    }

    @Override
    public double caucularArea() {
        return 0;
    }
}
