package org.example;

public class Main {
    public static void main(String[] args) {
        //declaracion e instanciacion [tamaño]
        String dias [] = new String[7];

        //      0     1     2        3        4      5       6
        //  DOmingo Lunes Martes Miercoles Jueves Viernes Sabado

        // ALmacenamos datos dentro del array

        dias[0] = "Domingo";
        dias[1] = "Lunes";
        dias[2] = "Martes";
        dias[3] = "Miercoles";
        dias[4] = "Jueves";
        dias[5] = "Viernes";
        dias[6] = "Sabado";


        System.out.println("Los dias de la semana son " + dias.length);

       /*
        for (int i = 0; i < dias.length; i++){
            System.out.println(dias[i]);
        }
       */
        //ForEach (For extendido, recorre los elementos de un array olista
        // y podemos realizar distintas acciones
        for (String dia: dias) {
            System.out.println(dia);
        }



    }



}