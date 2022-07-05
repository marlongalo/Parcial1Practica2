/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parcial1practica2;

/**
 *
 * @author Marlon Galo
 */
public class Parcial1Practica2 {

    public static void main(String[] args) {
        System.out.println("//Tarea Individual #2 - Módulo 2");
        System.out.println("//Elaborado por Marlon Galo");
        System.out.println("//1.-Crear una clase que se llame Recursos con 4 métodos diferentes");
        System.out.println("//2.-Instanciar la clase en el programa principal y llamar a los métodos con diferentes operaciones");
        System.out.println("Practica en GITBUB");
        //Instanciar la clase Recursos
        Recursos recursos = new Recursos();
                
        //Establecer informacion para el objeto recursos
        recursos.leyenda();
        recursos.edadEstudiante(20);
        recursos.multiplica(2,10);
        recursos.listaNumeros(30);
       }
    
}
