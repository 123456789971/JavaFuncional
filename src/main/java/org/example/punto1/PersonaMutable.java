package org.example.punto1;

public class PersonaMutable {
    private String nombre;

    public PersonaMutable(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        PersonaMutable persona = new PersonaMutable("Juan");
        System.out.println(persona.getNombre());

        persona.setNombre("Pedro");
        System.out.println(persona.getNombre());
    }
}
