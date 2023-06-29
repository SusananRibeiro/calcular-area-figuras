package model;

import model.Figura;

public class Retangulo extends Figura {
    private double lado1;
    private double lado2;

    // Método construtor
    public Retangulo(double lado1, double lado2, String cor) {
        super.setCor(cor); // superclasse ou pai model.Figura
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override // ligando a classe abstrata model.Figura
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "model.Retangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", getLado1()=" + getLado1() + ", getLado2()="
                + getLado2() + ", calcularArea()=" + calcularArea() + "]";
    }
}

