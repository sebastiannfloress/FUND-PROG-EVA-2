/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author saulf
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        int valor1, valor2;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Valor 1: ");
        valor1 = input.nextInt();
        System.out.println("Valor 2: ");
        valor2 = input.nextInt();
        
        
        if(valor1 > valor2)
            System.out.println("El valor mas grande es el " + valor1);
        else
            if(valor1 == valor2)
                System.out.println("Ambos valores son iguales");
            else
                System.out.println("El valor mas pequeno es " + valor1);
        
        
        
        
    }
}
