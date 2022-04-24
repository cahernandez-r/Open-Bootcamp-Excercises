package com.openbootcamp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("EL precio del producto mas el Iva es "+precioIva(19000));
    }
    static double precioIva(double precio){
        double iva = 0.19;
        return (precio * iva) + precio;
    }
}
