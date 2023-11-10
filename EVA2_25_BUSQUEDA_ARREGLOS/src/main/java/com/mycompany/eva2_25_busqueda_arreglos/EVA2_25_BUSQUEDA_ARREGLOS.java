/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_25_busqueda_arreglos;

import java.util.Scanner;

/**
 *
 * @author saulf
 */
public class EVA2_25_BUSQUEDA_ARREGLOS {

    public static void main(String[] args) {
        //CREAR UN ARREGLO DE 15 ELEMENTOS
        int[] arreglo = new int [15];
        // LLENARLO CPN VALORES ALEATORIOS entre 0 y 99
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
           
            
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
            
        }
        System.out.println("");
        int num;
            Scanner input = new Scanner(System.in);
            System.out.println("¿Que numero buscas?");
             num = input.nextInt();
             
             
             for (int i = 0; i < arreglo.length; i++) {
                 
                 if(arreglo[i]== num)//valor encontrado
                     System.out.println("Valor encontrado en la posicion " + i);
                 break;
                 
             }
             
        
    }
    
}
