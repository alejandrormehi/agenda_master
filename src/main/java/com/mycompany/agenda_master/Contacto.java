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
public class Contacto {
    
    private String nombre;
    private int numeroTelefono;
    private String email;
    String tieneCascos = "no";
    
    
    
    /* CONSTRUCTOR POR DEFECTO, QUE SE CREEN CONTACTOS CON 
    DICHOS DATOS
    */
    public Contacto(){
        nombre = "";
        numeroTelefono = 0;
        email = "";
    }
    
    public Contacto (String nm, int num, String eml){
        nombre = nm;
        numeroTelefono = num;
        email = eml;
    }
    
    public String getNombre(){
        return nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static void mostrarAgenda(Contacto[] contact, Scanner sc){
        
        for(int i=0; i<contact.length;i++){
            if(contact[i].getNumeroTelefono()!=0){
                System.out.println("Nombre: "+contact[i].getNombre());
                System.out.println("Telefono: "+contact[i].getNumeroTelefono());
                System.out.println("Email: "+contact[i].getEmail());
                System.out.println("");
            }else{
                break;
            }
        }
        sc.nextLine();
    }
    
    public static void mostrarDatos(Contacto[] contact, Scanner sc){
        sc.nextLine();
        
        
    }
    
}
