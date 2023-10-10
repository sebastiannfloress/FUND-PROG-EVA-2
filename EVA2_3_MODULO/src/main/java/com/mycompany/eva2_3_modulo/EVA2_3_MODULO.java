/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_modulo;

import java.util.Scanner;

/**
 *
 * @author saulf
 */
public class EVA2_3_MODULO {

    public static void main(String[] args) {
        int valor;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el valor a evaluar");
        valor = input.nextInt();
        int residuo;
        
        residuo = valor % 2;
        if (residuo == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El valor es impar");
           
        }
    }
}
