/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Main {

    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n\n",
                    "1. Sumar",
                    "2. Restar",
                    "3. Multiplicar",
                    "4. Dividir",
                    "5. Salir");
            System.out.printf("%s", "Opción: ");
            op = Integer.valueOf(sc.nextLine());
            if (op != 5) {
                int resultado, num1, num2;
                float respuesta;
                switch (op) {
                    case 1:
                        //Suma
                        System.out.printf("%s", "Número 1: ");
                        num1 = Integer.valueOf(sc.nextLine());
                        System.out.printf("%s", "Número 2: ");
                        num2 = Integer.valueOf(sc.nextLine());
                        resultado = num1 + num2;
                        System.out.println("Respuesta: " + resultado);
                        break;
                    case 2:
                        //Resta
                        System.out.printf("%s", "Número 1: ");
                        num1 = Integer.valueOf(sc.nextLine());
                        System.out.printf("%s", "Número 2: ");
                        num2 = Integer.valueOf(sc.nextLine());
                        resultado = num1 - num2;
                        System.out.println("Respuesta: " + resultado);
                        break;
                    case 3:
                        //Multiplicacion
                        break;
                    case 4:
                        //Division
                        break;
                }
            }
        } while (op != 5);
    }
}
