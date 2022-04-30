package com.excercise;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //Ejercicio Reverse
        System.out.println(reverse("hola mundo"));
        //Ejercicio1
        ejercicio1();
        //Ejercicio2
        ejercicio2();
        //Ejercicio3
        ejercicio3();
        //Ejercicio4:
        /*Si empezamos a llenar el vector y no se ha especificado el valor de incremento de la capacidad del vector
        este empezara a copiarse en arrays subyacentes aumentando su capacidad de 10 en 10 y esto seria muy
        costoso para la memoria del equipo.
        */
        //Ejercicio5
        ejercicio5();
        //Ejercicio6
        ejercicio6();//Solo sirve para tamaños de 10 xD
        //Ejercicio7
        try{
            dividePorcero(4,0);

        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }
        //Ejercicio8
        ejercicio8("src/hola.txt","src/destino.txt");
    }
    //Ejercicio reverse
    static String reverse(String str){
        System.out.println("\nEjercicio Reverse\n");
        String temp = "";
        for(int i = str.length() -1; i >= 0  ; i--){
            temp += str.charAt(i);
        }
        return temp;
    }
    //Ejercicio 1:
    static void ejercicio1(){
        System.out.println("Ejercicio1\n");
        String [] cadenas = {"Cadena1","cadena2","123"};
        for(String cadena : cadenas){
            System.out.print(cadena+ " ");
        }
    }
    static void ejercicio2(){
        System.out.println("Ejercicio2\n");
        int [][] enteros = {{2,4,3,4},{4,3,5,4}};

        for(int i = 0; i < enteros.length; i++){
            for(int j = 0; j < enteros[i].length; j++){
                System.out.println("Posicion: Fila ["+ i + "] Columna ["+ j +"] Valor = "+enteros[i][j]);
            }
            System.out.println();
        }
    }
    static void ejercicio3(){
        System.out.println("Ejercicio3\n");
        List<Integer> enteros = new Vector<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        System.out.println("Vector antes del remove "+enteros);
        enteros.remove(1);
        enteros.remove(1);//si coloco 2 eliminaria el cuarto elemento del vector original
        System.out.println(enteros);
    }
    static void ejercicio5(){
        System.out.println("Ejercicio5\n");
        ArrayList<String> cadenas = new ArrayList<String>();
        cadenas.add("cadena1");
        cadenas.add("cadena2");
        cadenas.add("cadena3");
        cadenas.add("cadena4");
        List<String> listaEnlazada = new LinkedList<>(cadenas);
        for(String cadena : cadenas){
            System.out.print(cadena+" ");
        }
        System.out.println();
        for(String cadena : listaEnlazada){
            System.out.print(cadena+" ");
        }
    }
    static void ejercicio6(){
        System.out.println("\nEjercicio5\n");
        List<Integer> enteros = new ArrayList<>();
        for(int i = 1;i <= 10; i++){
            enteros.add(i);
        }
        for(int i = 0; i < enteros.size(); i++){
            if(enteros.get(i) % 2 != 0){
                enteros.remove(i+1);
                System.out.print(enteros.get(i)+" ");

            }

        }
    }
    static void dividePorcero(int a , int b) throws ArithmeticException{
        System.out.println("\nEJERCICIO 7\n");
        try{
            System.out.println(a / b);
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }
    static void ejercicio8(String fileIn, String fileOut){
        try {
            InputStream inFile = new FileInputStream(fileIn);
            PrintStream outFile = new PrintStream(fileOut);
            byte[] datosIn = inFile.readAllBytes();
            outFile.write(datosIn);
            inFile.close();
            outFile.close();

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}


