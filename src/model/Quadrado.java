package model;

public class Quadrado extends Retangulo {

    public Quadrado(double lado1, double lado2, String cor) {
        super(lado1, lado2, cor);
    }


    @Override // ligando a classe abstrata model.Figura
    public double calcularArea() {
        return (getLado1() + getLado2()) * 2;
    }


    @Override
    public String toString() {
        return "model.Quadrado [calcularArea()=" + calcularArea() + "]";
    }
}