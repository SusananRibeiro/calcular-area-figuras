import model.*;

public class FiguraApp {
    public static void main(String[] args) {
            Figura figuraRetangulo1 = new Retangulo(5, 2, "preto"); // instaciar
            System.out.println("Área do Retângulo: " + figuraRetangulo1.calcularArea());

            Figura figuraQuadrado1 = new Quadrado(4, 4, "preto");
            System.out.println("Área do model.Quadrado: " + figuraQuadrado1.calcularArea());

            Figura figuraTriangulo1 = new Triangulo(4, 10, "preto");
            System.out.println("Área do model.Triangulo: " + figuraTriangulo1.calcularArea());

            Circulo figuraCirculo1 = new Circulo(6, "preto");
            System.out.println("Área do model.Circulo: " + figuraCirculo1.calcularArea());
    }
}