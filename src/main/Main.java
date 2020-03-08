package main;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int i; //for
        int j; //while
        int k; //Do ...while

        System.out.println("Ingrese valor para mostrar la tabla de multiplicar hasta 10");
        int valor = teclado.nextInt();

        for(i=1; i<=10; i++){
            System.out.println(valor + " x " + i + " = " + (valor*i));
        }

        System.out.println("");
        System.out.println("");

        j = 1;
        while (j <= 10){
            System.out.println(valor + " x " + j + " = " + (valor*j));
            j++;
        }

        System.out.println("");
        System.out.println("");

        k = 1;
        do {
            System.out.println(valor + " x " + k + " = " + (valor*k));
            k++;
        }while (k <= 10);

    }

}
