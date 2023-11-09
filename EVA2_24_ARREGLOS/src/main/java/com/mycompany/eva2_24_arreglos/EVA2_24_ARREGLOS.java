/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_24_arreglos;

import java.util.Scanner;

/**
 *
 * @author saulf
 */
public class EVA2_24_ARREGLOS {

    public static void main(String[] args) {
        int cant;
        int[] arregloCali;
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantas calificaciones se van a capturar?");
        cant = input.nextInt();
        arregloCali = new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificacion: ");
            arregloCali[i] = input.nextInt();
            
            
            
        }
        for (int i = 0; i < cant; i++) {
            System.out.print(arregloCali[i] + "-");
            
        }
    }
}
