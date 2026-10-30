package org.upiiz.ipn;
import java.util.Locale;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        // Validación de dimensiones
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor a cero.");
        }
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Figura: Círculo");
        System.out.println("Radio: " + radio);
        System.out.printf(Locale.US, "Área: %.2f\n", calcularArea());
        System.out.printf(Locale.US, "Perímetro: %.2f\n\n", calcularPerimetro());
    }
}
