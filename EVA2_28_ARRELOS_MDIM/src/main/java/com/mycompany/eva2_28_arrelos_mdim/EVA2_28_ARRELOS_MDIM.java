/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_28_arrelos_mdim;

/**
 *
 * @author saulf
 */
public class EVA2_28_ARRELOS_MDIM {

    public static void main(String[] args) {
        //AREGLO DE DOS DIMENSIONES: MATRIZ
                                //filas,columnas
        int[][] matriz = new int[5][10];
        
        //ASIGNAR UN VALOR
        matriz[1][3] = 100;
        System.out.println("Valor en [1][3] = " + matriz[1][3]);
        System.out.println("Matriz.length = " + matriz.length);
        
        //matriz.length siempre es la primer dimension
        for (int i = 0; i < matriz.length; i++) { //filas
            
            
            for (int j = 0; j < matriz[i].length; j++) { //columnas
                matriz [i][j] = (int)(Math.random()* 100);
                
            }
            
            
        }
         for (int i = 0; i < matriz.length; i++) { //filas
            
            
            for (int j = 0; j < matriz[i].length; j++) { //columnas
                System.out.print("[" + matriz[i][j] + "]");
                
                
                
            }
             System.out.println("");
         }
        
    }
}
