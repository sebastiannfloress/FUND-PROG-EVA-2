/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CARRERAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String carrera;
      Scanner input = new Scanner(System.in);
        System.out.println("Introduce las siglas de la carrera : ");
        carrera = input.nextLine();
        
        
        switch(carrera){
            case "ISC":
                System.out.println("INGENERIA EN SISTEMAS COMPUTACIONALES");
                break;
            case "INF":
                System.out.println("INGENERIA EN INFORMATICA");
                break;
            case "IND":
                System.out.println("INGENERIA INDUSTRIAL");
                break;
            case "IDI":
                System.out.println("INGENERIA EN DISEÑO INDUSTRIAL");
                break;
            case "LA":
                System.out.println("LICENCIATURA EN ADMINISTRACION");
                break;
            case "IGE":
                System.out.println("INGENERIA EN GESTION EMPRESARIAL");
                break;
            case "ARQ":
                System.out.println("ARQUITECTURA");
                break;
            default :
               System.out.println("SIGLAS NO VALIDAS");
               
               
               
               
   
   
   
   
   
   
   
   }
   
}
