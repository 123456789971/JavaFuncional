package org.example.punto9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ManejoDeNombres {


    private static final List<String> listaDeNombres = Arrays.asList("Carlos", "Ana", "María", "Pedro", "Juan", "Ana");

    public static void main(String[] args) {

        List<String> nombresFiltrados = filtrarNombres("Ana");
        imprimirNombresFiltrados(nombresFiltrados);
    }

    public static List<String> filtrarNombres(String nombre) {
        return listaDeNombres.stream()
                .filter(n -> n.equals(nombre))
                .collect(Collectors.toList());
    }

    public static void imprimirNombresFiltrados(List<String> nombresFiltrados) {
        Optional.ofNullable(nombresFiltrados)
                .ifPresent(nombres -> nombres.forEach(System.out::println));
    }
}
