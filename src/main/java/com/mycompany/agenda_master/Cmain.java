/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_master;
import java.util.Scanner;
/**
 *
 * @author prome
 */
public class Cmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Contacto[]agenda = new Contacto[10];
        
        for(int i=0; i<agenda.length;i++){
            agenda[i] = new Contacto("",0, "");
            
        }
        /* Contactos iniciales*/
        agenda[0] = new Contacto("Pepe", 69696479, "pepe@mail.com");
        agenda[1] = new Contacto("Juan", 69696959, "juan@mail.com");
        agenda[2] = new Contacto("Toni", 694444355, "toni@mail.com");
        agenda[3] = new Contacto("Ivan", 696933329, "ivan@mail.com");
        agenda[4] = new Contacto("Miguel", 6969677, "miguel@mail.com");
        
        boolean fin = false;
        
        while(fin == false){
            boolean salir = false;
                
                if(!agenda[agenda.length-1].getNombre().equals("")){
                    System.out.println("La agenda esta LLENA");
                }else if(agenda[0].getNombre().equals("")){
                    System.out.println("La agenda está VACIA");
                }else{
                    System.out.println("ERROR");
                    break;
                }
                
                while(salir == false){
                    System.out.println("");
                    System.out.println("Quieres hacer otra opcion?");
                    String opcion = sc.nextLine();
                    
                    if(opcion.equalsIgnoreCase("si")){
                        salir = true;
                    }else if (opcion.equalsIgnoreCase("no")){
                        fin = true;
                        salir = true;
                    }else{
                        System.out.println("Opcion incorrecta");
                  }
             }
         }      
    }
}
