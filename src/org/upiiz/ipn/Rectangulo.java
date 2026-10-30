package org.upiiz.ipn;
import java.util.Locale;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        // Validación de dimensiones
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura deben ser mayores a cero.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Figura: Rectángulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.printf(Locale.US, "Área: %.2f\n", calcularArea());
        System.out.printf(Locale.US, "Perímetro: %.2f\n\n", calcularPerimetro());
    }
}
