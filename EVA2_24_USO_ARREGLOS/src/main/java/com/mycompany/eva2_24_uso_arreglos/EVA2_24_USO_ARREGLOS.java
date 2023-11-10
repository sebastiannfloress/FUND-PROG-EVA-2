/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_24_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author saulf
 */
public class EVA2_24_USO_ARREGLOS {

    public static void main(String[] args) {
        String[] platillos = new String[10];
        platillos[0] = "Tacos";
        platillos[1] = "Tortas de lomo";
        platillos[2] = "Tortas ahogadas";
        platillos[3] = "Tamales";
        platillos[4] = "Tripitas";
        platillos[5] = "Flautas";
        platillos[6] = "T-bone";
        platillos[7] = "Boneless";
        platillos[8] = "Alitas";
        platillos[9] = "Chilaquiles";
        
        double[] precio = {20, 50, 80, 45, 68, 89, 95, 98, 73, 90};
        System.out.println("---------------MENU--------------");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i + " - " + platillos[i] + ": $" + precio[i]);
            
            int opc, cant;
            Scanner input = new Scanner(System.in);
            System.out.println("¿Que quieres ordenar?");
            opc = input.nextInt();
            System.out.println("¿Cuantas ordenes quieres?");
            cant = input.nextInt();
            System.out.println("El costo de tu pedido es : $" + (cant * precio[opc]));
            
            
            
        }
    }
}
