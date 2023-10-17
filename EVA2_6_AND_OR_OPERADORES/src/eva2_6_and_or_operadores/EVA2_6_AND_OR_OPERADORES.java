/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_AND_OR_OPERADORES {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int califa;
      Scanner input = new Scanner(System.in);
      System.out.println("Introduce la calificacion: ");
      califa = input.nextInt();
      
      
      
      //VALIDAR 
      //UNA CALIFA ES MAYOR O IGUAL 0
      //Y &&
      //LA CALIFA ES MENOR O IGUAL A 100
      
      if((califa >= 0) && (califa <= 100)){// VALOR VALIDO
         System.out.println("La calificacion " + califa + " es valida!!!");
         if(califa >= 70)
            System.out.println("APROBADO");
         else 
            System.out.println("NO ACREDITADO");
   }else {
       System.out.println("La calificacion " + califa + " no es valida!!!");  
      }
   }
}
