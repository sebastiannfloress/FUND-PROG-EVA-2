/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author saulf
 */
public class EJERCICIO3 {

    public static void main(String[] args) {
        int nume1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un  numero");
        nume1 = input.nextInt();
        
        
        
        int sum = 0;
        for (int i = 1; i <= nume1; i++) {
            sum += i;
            
            
        }
        System.out.println("La sumatoria de 1 a " + nume1 + " es: " + sum);
        
    }
}
