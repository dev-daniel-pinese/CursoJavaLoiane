package aulas.aula46.Exer01;

public class Triangulo extends Figura2D {
    private double altura;
    private double base;
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double caucularArea() {
        return ((altura * base)/2);
    }
}
