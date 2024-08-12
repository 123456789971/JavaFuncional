package org.example.punto2yPunto3;

import java.util.function.Function;
import java.util.function.Predicate;

public class FuncionesPuras {

    public static Function<Integer, Integer> cuadrado = x -> x * x;

    public static Predicate<Integer> esPar = numero -> numero % 2 == 0;

    public static void main(String[] args) {

        int numero = 4;
        int resultado = cuadrado.apply(numero);
        System.out.println("El cuadrado de " + numero + " es: " + resultado);

        boolean esNumeroPar = esPar.test(resultado);
        System.out.println("¿La funcion es par? " + (esNumeroPar ? "Sí" : "No"));
    }
}
