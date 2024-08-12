package org.example.punto6;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;

@FunctionalInterface
interface ValidadorEdad {
    String validar(String nombre, int edad, LocalDate fechaNacimiento);
}

public class ValidacionEdad {

    public static void main(String[] args) {

        ValidadorEdad validarEdad = (nombre, edad, fechaNacimiento) -> {

            BiFunction<LocalDate, Integer, Boolean> esEdadCorrecta = (fecha, edadIngresada) -> {
                int edadCalculada = Period.between(fecha, LocalDate.now()).getYears();
                return edadCalculada == edadIngresada;
            };

            boolean esValida = esEdadCorrecta.apply(fechaNacimiento, edad);
            return "La fecha de nacimiento de " + nombre +
                    (esValida ? " corresponde" : " no corresponde") +
                    " a la edad ingresada.";
        };

        String nombre = "Carlos";
        int edad = 25;
        LocalDate fechaNacimiento = LocalDate.of(1999, 8, 15);

        String resultado = validarEdad.validar(nombre, edad, fechaNacimiento);
        System.out.println(resultado);
    }
}
