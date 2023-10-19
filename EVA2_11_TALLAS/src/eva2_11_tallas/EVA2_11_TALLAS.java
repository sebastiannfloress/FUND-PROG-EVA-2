/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_tallas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_11_TALLAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int tallas;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de talla: ");
        tallas = input.nextInt();
        
        switch(tallas){
            case 29:
                System.out.println("SMALL");
                break;
        
            case 42:
                System.out.println("MEDIUM");
                break;
        
            case 44:
                System.out.println("LARGE");
                break;
    
            case 48:
                System.out.println("XLARGE");
                break;
            default:
               System.out.println("EL NUMERO DE TALLA ES INAVLIDO");
               
               
      
      
   }
   
}
