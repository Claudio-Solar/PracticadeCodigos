/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicadecodigos;

/**
 *
 * @author victo
 */
public class CSesion2 {
       //Ingreso de Datos por Teclado
        //Scanner sc=new Scanner(System.in);
        
        /* PROGRAMACION ESTÁTICA
        int num1=10;
        int num2=10;
        
        int Resultado=num1+num2;
        System.out.println("El resultado es: "+Resultado);
        */
        //SUMA DE DOS NÚMEROS POR TECLADO
        /*
        int num1;
        int num2;
        int resultado;
        
        System.out.println("Ingrese el primer numero");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=sc.nextInt();
        resultado=num1+num2;
        System.out.println("El resultado es: "+resultado);
        */
        Scanner sc=new Scanner(System.in);
        
        String nombre;
        int edad;
        double sueldo;
        System.out.println("*********SISTEMA DE REGISTRO***********");
        System.out.println("=======================================");
        System.out.println("Ingrese su nombre: ");
        System.out.println("=======================================");
        nombre=sc.nextLine();
        System.out.println("=======================================");
        System.out.println("Ingrese su edad: ");
        System.out.println("=======================================");
        edad=sc.nextInt();
        System.out.println("=======================================");
        System.out.println("Ingrese su sueldo: ");
        System.out.println("=======================================");
        sueldo=sc.nextDouble();
        System.out.println("====================================================================================");
        System.out.println("El nombre ingresado es: "+nombre+ "\n"+
                           "La edad ingresada es: "+edad+ "\n"+
                           "El sueldo ingresado es: "+sueldo);
        System.out.println("====================================================================================");
        System.out.println("GRACIAS POR RELLENAR EL FORMULARIO :D");
        System.out.println("====================================================================================");
        
         //CONDICIONALES
        //CONDICIONALES IF
        
        if (10>5) {
            System.out.println("10 es mayor a 5");
        }
        int condicionalNum1=10;
        int condicionalNum2=8;
        
        if(condicionalNum1>condicionalNum2){
            System.out.println("10 es mayor a 8");
        }
        
        //CONDICIONALES IF ELSE
        
        int edad1=20;
        if (edad1<18) {
            System.out.println("Ustede es menor de edad");
        }
        else{
            System.out.println("Usted es MAYOR de edad");
        }
        //Condicionales anidadas
        int hora=11;
        if (hora<=11) {
            System.out.println("Es mañana");   
        }
        else if (hora==12) {
            System.out.println("Es el medio dia");
        }
        else{
            System.out.println("Es noche");
        }
        
        //CONDIONALES UTILIZANDO OPERADORES TERNARIOS(no muy usada, se usa para dos condionales)
        
        int edad2=20;
        String ResultadoEdad=(edad2<18)?"Menor de Edad": "Mayor de edad";
        System.out.println(ResultadoEdad);
        
        //Switch Case
        
        int diaSemana=3;
        switch (diaSemana){
            case 1:
                System.out.println("Lunes");
            break;
            case 2:
                System.out.println("Martes");
            break; 
            case 3:
                System.out.println("Miercoles");
            break;
            case 4:
                System.out.println("Jueves");
            break; 
            case 5:
                System.out.println("Viernes");
            break;
            case 6:
                System.out.println("Sabado");
            break;
            case 7:
                System.out.println("Domingo");
            break;
            default:
                System.out.println("No ingreso un dia valido");
        }
        //Ciclos infinitos while
        
        /*int contadorWhile=0;
        //Se ejecutar siempre y cuando la condición sea Verdadera
        
        while (contadorWhile<10) {
              System.out.println("contador While");
              contadorWhile++;
        
              //contadorWhile=contadorWhile+1
        }
        */
        //Do While
        //Aqui siempre se ejecuta una vez la instruccion como minimo
        
        int contadorWhile=0;
        
        do{
            System.out.println(contadorWhile);
            contadorWhile++;
        }while (contadorWhile<5);
        
        //Cliclos finitos FOR
        
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println(i);  
        }
        //FOR EACH nos sirve para recorrer arreglos, vectores, matrices
        
        String [] AlumnosForEch={"Frank","Liliana","Claudio","Vinicio"};
        //Mostrar todos los registros
        for(String iForEach:AlumnosForEch){
            System.out.println(iForEach); 
         }
        //Matricesunidimensionales
        
        String [] matrizAutos={"Toyota","BMN","Ford"};
        int [] matrizNumero={10,11,12,13,14,15};
        
        //Ingresando valores a la matriz por posicion
        System.out.println(matrizAutos[0]);
        
        //Cambiando de valor un elemnto de mi matriz
        System.out.println("********************");
        
        matrizAutos[1]="Subaru";
        System.out.println(matrizAutos[1]);
          System.out.println("********************");
        for(String iForEach2:matrizAutos){
            System.out.println(iForEach2); 
        }
        //Matricwes multidimensionales
        int [][] matrizMultidimensional={{1,2,3,4},{5,6,7,8}};
        
        int misElementos=matrizMultidimensional [1][2];
        System.out.println(misElementos);
        
        //Mostrando todos los datos de mi matroz multidimensional
        for (int j = 0; j < matrizMultidimensional.length; j++) {
                  System.out.println("\n");
            for (int k = 0; k < matrizMultidimensional[j].length; k++) {
                 System.out.println(matrizMultidimensional[j][k]);
           
            }
            
        } 
}
