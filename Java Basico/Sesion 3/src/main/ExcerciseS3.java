package main;

import java.util.Scanner;

public class ExcerciseS3 {
    public static void main(String[] args) {
        String []lista = {"carro","nuevo","moto"};
        System.out.println(concatena(lista));
        System.out.println(concatena(3));
    }
    static String concatena(String[] lista){
        String temp = "";
        for(String s : lista){
            temp += s +" ";
        }
        return temp;
    }
    static String concatena(int cantidadStrings){
        Scanner scan = new Scanner(System.in);
        String temp ="";
        for(int i = 0; i < cantidadStrings ;i++){
            System.out.println("Ingrese la cadena");
            temp += scan.nextLine()+" ";
        }
        return temp;
    }
}
