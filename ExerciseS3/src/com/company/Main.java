package com.company;

public class Main {

    public static void main(String[] args) {
        //primera parte
        System.out.println("La suma es "+sum(4,2,4));
        //segunda parte
        Coche miCoche = new Coche();
        miCoche.incrementaPuertas();
        miCoche.incrementaPuertas();
        System.out.println("El numero de puertas es "+miCoche.numeroPuertas);
    }
    public static int sum(int a,int b, int c){
        return (a+b+c);
    }
}
class Coche{
    public int numeroPuertas = 0;

    public void incrementaPuertas(){
        this.numeroPuertas++;
    }
}
