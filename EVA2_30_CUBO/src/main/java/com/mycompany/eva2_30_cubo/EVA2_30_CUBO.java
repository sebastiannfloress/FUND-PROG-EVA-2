/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_30_cubo;

/**
 *
 * @author saulf
 */
public class EVA2_30_CUBO {

    public static void main(String[] args) {
                               // 3 dimensiones-----cubo
        int cubo[][][] = new int [3][4][5];
        
        
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] = (int)(Math.random()* 100);
                    System.out.print("[" + cubo[i][j][k] +"]");
                
            }
                System.out.println("");
                
            }
            System.out.println("");
            System.out.println("");
        
            
            
        }
    }
}
