package lista2;

abstract class FiguraGeometrica {
    public abstract double calcularArea();
}

class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

public class ex2 {
    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(5.0);
        FiguraGeometrica retangulo = new Retangulo(4.0, 6.0);
        FiguraGeometrica triangulo = new Triangulo(3.0, 5.0);
        FiguraGeometrica circulo = new Circulo(2.0);

        double areaQuadrado = quadrado.calcularArea();
        double areaRetangulo = retangulo.calcularArea();
        double areaTriangulo = triangulo.calcularArea();
        double areaCirculo = circulo.calcularArea();

        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println("Área do triângulo: " + areaTriangulo);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}

