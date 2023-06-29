package model;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        super.setCor(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override // ligando a classe abstrata model.Figura
    public double calcularArea() {
        return 3.1415 * (Math.pow(raio, 2));
    }

    @Override
    public String toString() {
        return "model.Circulo [raio=" + raio +
                ", calcularArea()=" + calcularArea() +
                "]";
    }
}
