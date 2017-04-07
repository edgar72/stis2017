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
        int dimension;
        System.out.println("Ingrese el numero de alumnnos que ingresara: ");
        dimension=sc.nextInt();
        String nombre[]= new String[dimension];
        double promedio[]= new double [dimension];
        double nota[]= new double [dimension];
        double nota2[]= new double [dimension];
        int edad[]= new int [dimension];
        double general=0;
        double pgeneral=0;
        int notas=0;
        for(int i=0; i<dimension; i++){
            System.out.println("Ingrese el nombre del alumno: "+(i+1));
            nombre[i]=sc.next();
            System.out.println("Ingrese la edad: ");
            edad[i]=sc.nextInt();
            System.out.println("Ingrese la nota 1");
            nota[i]=sc.nextDouble();
            System.out.println("Ingrese la nota 2");
            nota2[i]=sc.nextDouble();
            notas++;
            promedio[i]=PromedioAlum(nota[i], nota2[i]);
            pgeneral=pgeneral+promedio[i];
           
        }
        for(int i=0; i<dimension; i++){
            System.out.println("Nombre del alumno "+(i+1)+" "+ nombre[i]);
            System.out.println("edad del alumno "+(i+1)+" "+ edad[i]);
            System.out.println("Promedio del alumno "+(i+1)+" "+promedio[i]);
            System.out.println("Le decimos que: "+Mandarmsj(promedio[i])+"\n\n");
            
        }
        
         System.out.println("El promedio general es de: "+PromGeneral(pgeneral, notas));
    }
    public String Mandarmsj(double promedio){
        String mensaje="";
        if(promedio>0 && promedio<=4){
            mensaje="Muy malo";
        }
        else if(promedio>4 && promedio<=6){
            mensaje="Deficiente";
        }
        else if(promedio>6 && promedio<=8){
            mensaje="Muy bueno";
        }
        else if(promedio>8 && promedio<=10){
            mensaje="Excelente.";
        }
        return mensaje;
    }
    
    public double PromGeneral(double pgeneral, int notas ){
        double todo;
        todo=pgeneral/notas;
        Math.round(todo);
     return todo;   
    }
    
    public double PromedioAlum(double nota, double nota2){
        double promedio=(nota+nota2)/2;
        return promedio;
    }
}
