package model;

import model.Figura;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        super.setCor(cor);
        this.base = base;
        this.altura = altura;
    }

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

    @Override // ligando a classe abstrata model.Figura
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "model.Triangulo [base=" + base + ", altura=" + altura + ", getBase()=" + getBase() + ", getAltura()="
                + getAltura() + ", calcularArea()=" + calcularArea() + "]";
    }
}

