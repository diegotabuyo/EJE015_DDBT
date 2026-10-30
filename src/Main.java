package org.upiiz.ipn;
import java.util.ArrayList;
import java.util.List;

//Diego Daniel Becerra Tabuyo 3IM1

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FIGURAS GEOMÉTRICAS ===\n");

        // Almacenar objetos en una colección de la clase base
        List<FiguraGeometrica> figuras = new ArrayList<>();

        // Creación de objetos con los datos de ejemplo
        figuras.add(new Circulo(5.0));
        figuras.add(new Rectangulo(4.0, 6.0));
        figuras.add(new Triangulo(3.0, 4.0, 5.0));

        // Recorrer la colección haciendo uso estricto de Polimorfismo
        for (FiguraGeometrica figura : figuras) {
            figura.mostrarInformacion();
        }
    }
}