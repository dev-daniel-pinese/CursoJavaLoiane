package aulas.aula46.Exer01;

public class Piramide extends Figura3D{
    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;

    private Figura2D base;

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }



    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getArestaBase() {
        return arestaBase;
    }


    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    /**
     * @return the apotema
     */
    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }


    public Figura2D getBase() {
        return base;
    }


    public void setBase(Figura2D base) {
        this.base = base;
    }
    public double calcularArea() {
        if (base != null){
            return (numPoliBase * ((arestaBase*apotema)/2)) + base.caucularArea();
        }
        return 0;
    }

    public double caucularArea() {
        return 0;
    }

    @Override
    public double calcularVolume() {
        return 0;
    }
}
