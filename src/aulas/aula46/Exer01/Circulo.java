package aulas.aula46.Exer01;

public class Circulo extends Figura2D{
    private double raio;

    public double getRaio() {
        return raio;
    }


    public void setRaio(double raio) {
        this.raio = raio;
    }



    public double caucularArea() {
            return (raio * raio) * Math.PI;
    }
}
