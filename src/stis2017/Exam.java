/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stis2017;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Exam {
    public void Iniciar(){
        Scanner sc= new Scanner(System.in);
        
        
        
        int dimension=0;
        
        
        System.out.println("Ingrese el numero de alumnnos que ingresara: ");
        dimension=sc.nextInt();
        String nombre[]= new String[dimension];
        double promedio[]= new double [dimension];
        double nota[]= new double [dimension];
        double nota2[]= new double [dimension];
        int edad[]= new int [dimension];
        double general=0;
        double pgeneral=0;
        double todo=0;
        int notas=0;
        String mensaje="";
        for(int i=0; i<dimension; i++){
            System.out.println("Ingrese el nombre del alumno: ");
            nombre[i]=sc.next();
            System.out.println("Ingrese la edad: ");
            edad[i]=sc.nextInt();
            notas++;
            System.out.println("Ingrese la nota 1");
            nota[i]=sc.nextDouble();
            notas++;
            System.out.println("Ingrese la nota 2");
            nota2[i]=sc.nextDouble();
            promedio[i]=(nota[i]+nota2[i])/2;
            general=nota[i]+nota2[i];
            pgeneral=general+general;
            todo=pgeneral/notas;
        }
        for(int i=0; i<dimension; i++){
            System.out.println("Nombre del alumno "+ nombre[i]);
            System.out.println("edad del alumno "+ edad[i]);
            System.out.println("Promedio del alumno "+promedio[i]);
            calcprom(promedio[i]);
           
        }
         System.out.println("El promedio general es de: "+todo);
    }
    public double calcprom (double promedio){
        String mensaje="";
        if(promedio>0 && promedio<4){
            mensaje="Deficiente";
        }
        else if(promedio>=4 && promedio<6){
            mensaje="Regular";
        }
        else if(promedio>=6 && promedio<8){
            mensaje="Muy bueno";
        }
        else{
            mensaje="Excelente";
        }
        return promedio;
    }  
}
