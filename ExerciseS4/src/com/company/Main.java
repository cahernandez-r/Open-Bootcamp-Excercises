package com.company;

public class Main {

    public static void main(String[] args) {
        //primera parte
        int numeroIf = -3;
        if(numeroIf > 0){
            System.out.println("El numero positivo");
        }
        else if(numeroIf < 0){
            System.out.println("El numero es negativo");
        }
        else{
            System.out.println("El numero es 0");
        }
        //parte 2
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println("Ejecutando while valor de la variable "+numeroWhile);
            numeroWhile++;
        }
        //parte 3
        do{
            System.out.println("Ejecutando do while valor de la variable "+numeroWhile);
            numeroWhile++;
        }while(numeroWhile == 3);

        //parte 4
        int numeroFor = 0;
        for (;numeroFor < 3;numeroFor++){
            System.out.println("Valor de la variable for "+numeroFor);
        }

        //parte 5
        String estacion = "Verano";

        switch (estacion){
            case "Verano":
                System.out.println("La estacion es verano");
                break;
            case "Otoño":
                System.out.println("La estacion es otoño");
                break;
            case "Primavera":
                System.out.println("La estacion es primavera");
                break;
            case "Invierno":
                System.out.println("La estacion es invierno");
                break;
            default:
                System.out.println("No es ninguna estacion");
                break;
        }
    }

}

