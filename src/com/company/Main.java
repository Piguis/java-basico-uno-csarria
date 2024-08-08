package com.company;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


/*  //Ejercicio en Clase

Scanner scannerEdad = new Scanner(System.in);

        System.out.println("Ingresa la edad: ");

byte edad = scannerEdad.nextByte();


if (edad > 0 && edad <=12){

    System.out.println("La edad corresponde a un Niño");
}
else if (edad >=13 && edad <=20)
    System.out.println("La edad corresponde a un Joven");

else if (edad >=21 && edad <=60)
    System.out.println("La edad corresponde a un Adulto");

else if (edad >=61)
    System.out.println("La edad corresponde a una persona de Tercera edad");
*/

        //Ejercicio 1 java Basico (2)

       /* Scanner scannerCalificacionNumerica = new Scanner(System.in);
        System.out.println("Ingresa la calificación =) : ");

        byte calificacion = scannerCalificacionNumerica.nextByte();


switch (calificacion){
    case (1):
    case (2):
        System.out.println("Su calificacion es: F :(");
        break;
    case (3):
    case (4):
        System.out.println("Su calificacion es: D :/");
        break;
    case (5):
    case (6):
        System.out.println("Su calificacion es: C :|");
        break;
    case (7):
    case(8):
        System.out.println("Su calificacion es: B :)");
        break;
    case (9):
    case (10):
        System.out.println("Su calificacion es: A :D");
        break;
    default:
        System.out.println("Número no válido, por favor verifique");
        break;
}
*/      //Ejercicio 1 java Basico (1)
       Scanner LeerVariable = new Scanner(System.in);

        System.out.println("Ingrese el valor de A: ");
        byte a = LeerVariable.nextByte();

        System.out.println("Ingrese el valor de B: ");
        byte b = LeerVariable.nextByte();

        System.out.println("Ingrese el valor de C: ");
        byte c = LeerVariable.nextByte();

        if (a == b){
            System.out.println("El valor de A y B no debe ser igual");
        }
        else if (b == c)
            System.out.println("El valor de B y C no debe ser igual");
        else if (a == c)
            System.out.println("El valor de A y C no debe ser igual");
        else if (a>b && a>c)
            System.out.println("A es mayor que B y que C");
        else if (b>c && b>c)
            System.out.println("B es mayor que A y que C");
        else if (c>a && c>b)
            System.out.println("C es mayor que A y que B");

       }
    }

