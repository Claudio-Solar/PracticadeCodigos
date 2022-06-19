/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicadecodigos;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class PracticadeCodigos {

    public static void main(String[] args) {
       sumaDosNumerosVOID();
        System.out.println(sumaDosnumerosEnetero());
        sumaDosNumerosArgumentos(3, 4);
    }
    //Creando metodos
    //Metodo normal
    public static void sumaDosNumerosVOID(){
    int num1=5;
    int num2=4;
    int resultado=num1+num2;
        System.out.println("La suma es: "+resultado);   
    }
    //mETODO/FUNCION QUE RETORNA UN NUMERO ENTERO
    public static int sumaDosnumerosEnetero(){
    int num1=5;
    int num2=4;
    int resultado=num1+num2;
    
        return resultado; 
    }
    //MEtodo con argumentos
    
    public static void sumaDosNumerosArgumentos(int numero1,int numero2){
    int resultado= numero1+numero2;
        System.out.println("La suma es: "+resultado);
        
    }
        
   
}
