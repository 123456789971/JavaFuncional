package org.example.punto5;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class DivisionBigDecimal {

    public static void main(String[] args) {

        BinaryOperator<BigDecimal> dividir = (a, b) -> a.divide(b);


        BigDecimal num1 = new BigDecimal("15.75");
        BigDecimal num2 = new BigDecimal("3.5");

        BigDecimal resultado = dividir.apply(num1, num2);
        System.out.println("El resultado de la división es: " + resultado);
    }
}
