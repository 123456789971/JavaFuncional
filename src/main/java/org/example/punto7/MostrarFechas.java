package org.example.punto7;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class MostrarFechas {

    public static void main(String[] args) {

        List<LocalDate> fechas = Arrays.asList(
                LocalDate.of(2023, 8, 12),
                LocalDate.of(2024, 5, 21),
                LocalDate.of(2022, 12, 30)
        );

        Consumer<LocalDate> mostrarFechaFormateada = MostrarFechas::formatearYMostrar;
        fechas.forEach(mostrarFechaFormateada);
    }

    public static void formatearYMostrar(LocalDate fecha) {
        String dia = String.valueOf(fecha.getDayOfMonth());
        String mes = fecha.getMonth().toString().toLowerCase();
        mes = mes.substring(0, 1).toUpperCase() + mes.substring(1);
        String anio = String.valueOf(fecha.getYear());
        System.out.println("La fecha es " + dia + " de " + mes + " del " + anio);
    }
}
