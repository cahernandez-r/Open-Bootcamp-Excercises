package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\nDatos cliente\n");
        Cliente cliente = new Cliente(23,"Pepe","312323123",2.0000);
        System.out.println("\nDatos Trabajador\n");
        Trabajador trabajador = new Trabajador(28,"mario","31276373",500);
    }

}

class Persona{
    int edad;
    String nombre;
    String telefono;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    double credito;

    public Cliente(int edad, String nombre, String telefono, double credito){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.credito = credito;
        System.out.println(getEdad());
        System.out.println(getNombre());
        System.out.println(getTelefono());
        System.out.println(getCredito());
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario = salario;
        System.out.println(getEdad());
        System.out.println(getNombre());
        System.out.println(getTelefono());
        System.out.println(getSalario());
    }
    public double getSalario(){
        return this.salario;
    }
}