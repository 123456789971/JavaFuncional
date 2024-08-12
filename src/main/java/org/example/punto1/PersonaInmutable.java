package org.example.punto1;

public final class PersonaInmutable {
    private final String nombre;

    public PersonaInmutable(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        PersonaInmutable persona = new PersonaInmutable("Ana");
        System.out.println(persona.getNombre());

    }
}