/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_validar_usuario;

import java.util.Scanner;

/**
 *
 * @author saulf
 */
public class EVA2_19_VALIDAR_USUARIO {
final static String NOMBRE_USUARIO = "Admin";
final static String PASSWORD = "Admin";
    public static void main(String[] args) {
        String usuario, password;
        Scanner input = new Scanner(System.in);
        System.out.println(NOMBRE_USUARIO);
        System.out.println(PASSWORD);
        
        
        do{
            System.out.println("Introduce tu usuario: ");
            usuario = input.nextLine();
            System.out.println("Introduce tu contraseña: ");
            password = input.nextLine();
            
        }while((!usuario.equals(NOMBRE_USUARIO))  || (!password.equals(PASSWORD)));
        System.out.println("ACCESO CONSEDIDO. BIENVENDIO!!");
    }
}
