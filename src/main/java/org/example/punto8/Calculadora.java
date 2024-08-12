package org.example.punto8;

public class Calculadora {

    private double acumulado;

    public Calculadora(double inicial) {
        this.acumulado = inicial;
        System.out.println("Valor inicial: " + this.acumulado);
    }

    public Calculadora sumar(double valor) {
        this.acumulado += valor;
        System.out.println("Después de sumar " + valor + ": " + this.acumulado);
        return this;
    }

    public Calculadora restar(double valor) {
        this.acumulado -= valor;
        System.out.println("Después de restar " + valor + ": " + this.acumulado);
        return this;
    }

    public Calculadora multiplicar(double valor) {
        this.acumulado *= valor;
        System.out.println("Después de multiplicar " + valor + ": " + this.acumulado);
        return this;
    }

    public double getResultado() {
        return this.acumulado;
    }

    public static void main(String[] args) {

        Calculadora calc = new Calculadora(10);
        calc.sumar(5)
                .restar(2)
                .multiplicar(3);

        System.out.println("Resultado final: " + calc.getResultado());
    }
}