/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_while_infinito;

import java.util.Scanner;

/**
 *
 * @author saulf
 */
public class EVA2_17_WHILE_INFINITO {

    public static void main(String[] args) {
        int valor = 100;
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("INTRODUCE EL NUMERO QUE CREAS QUE ES EL CORRECTO: ");
            int num = input.nextInt();
            if(num == valor){
                
            
                System.out.println("ADIVINASTE!!!");
            break; // aqui termina el while
        
            }
        }
        
    }
}
