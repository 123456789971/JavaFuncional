package org.example.punto4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MisLibros {

    static class Libro {
        String nombre;
        String autor;
        int puntaje;

        public Libro(String nombre, String autor, int puntaje) {
            this.nombre = nombre;
            this.autor = autor;
            this.puntaje = puntaje;
        }

        @Override
        public String toString() {
            return nombre + " de " + autor + " (Puntaje: " + puntaje + ")";
        }
    }

    public static void main(String[] args) {

        Supplier<List<Libro>> crearListaDeLibros = () -> {
            List<Libro> libros = new ArrayList<>();
            libros.add(new Libro("El coronel no tiene quien le escriba", "Gabriel García Márquez", 5));
            libros.add(new Libro("1984", "George Orwell", 6));
            libros.add(new Libro("El Alquimista", "Paulo Coelho", 7));
            libros.add(new Libro("Adulterio", "Paulo Coelho", 9));
            libros.add(new Libro("Crepúsculo", "Stephenie Meyer", 8));
            return libros;
        };

        Consumer<List<Libro>> procesarLibros = libros -> {

            Predicate<Libro> esRecomendado = libro -> libro.puntaje >= 7;

            UnaryOperator<Libro> mostrarRecomendacion = libro -> {
                if (esRecomendado.test(libro)) {
                    System.out.println("El libro " + libro.nombre + " es recomendado");
                } else {
                    System.out.println("El libro " + libro.nombre + " no es recomendado.");
                }
                return libro;
            };

            libros.forEach((Consumer<? super Libro>) mostrarRecomendacion);
        };

        List<Libro> misLibros = crearListaDeLibros.get();
        procesarLibros.accept(misLibros);
    }
}