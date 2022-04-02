package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona persona1 = new Persona();
        persona1.setEdad(12);
        persona1.setNombre("Pepe");
        persona1.setTelefono(312988323);
        System.out.println("Edad "+persona1.getEdad());
        System.out.println("Nombre "+persona1.getNombre());
        System.out.println("Telefono "+persona1.getTelefono());

    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
