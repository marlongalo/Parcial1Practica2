/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1practica2;

/**
 *
 * @author Marlon Galo
 */
public final class Recursos {
    
    //Propiedades
    public String leyenda;
    public int x=0;
    public int y=0;
    public int z=0;
    public int j=0;
    
//Primer método: Retornar un mensaje que diga: "Programación Orientada a Objetos 2022".    
public String leyenda(){
    String mensaje = "Programación Orientada a Objetos 2022";
    System.out.println(mensaje);
        return mensaje;
}

//Segundo método 
public void edadEstudiante(int x){
    //Seguridad, edad no debe de ser mayor a 120
    if (x>120)
    {
        System.out.println("La edad del estudiante es:" +x +" Dato de edad erroneo, favor ingrese un numero menor a 120");
    }
    else
    {
        if (x>=21)
        {
            System.out.println("La edad del estudiante es:" +x +" El estudiante es mayor de edad");
        }
        else
        {
        System.out.println("La edad del estudiante es:" +x +" El estudiante es menor de edad");
        }
    }
        
  }

//Tercer método: Retornar el resultado de una Multiplicación de dos enteros que proporcionemos como parámetros.
public int multiplica(int y, int z){
    int multiplica = y*z;
    System.out.println("La multiplicacion de:" +y +"x" +z +"=" +multiplica);
    return multiplica;
}
        
//Cuarto método:  Debe retornar una lista de números del 1 al X. Donde X es un parámetro de entrada del método a crear.
public void listaNumeros(int j){
        //Se utiliza FOR para repetir el ciclo de los numeros desde el 0 hasta j      
        System.out.print("Se imprime ciclo desde el 0 hasta" +j +" ");
        for(int i=0;i<=j;i++){            
            System.out.print(i +" ");  
        }
}
}
