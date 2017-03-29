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
public class Ejemplo4 {
    
    public void calcular(){
        
        double sueldo=0;
        double descuento=0;
        double sub=0;
        double sueldof=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el sueldo del empleado");
        sueldo=sc.nextDouble();
        
        
        if(sueldo<700){
            descuento = 0.10;
            sub= sueldo*descuento;
            sueldof=sueldo-sub;
        }
        else{
            descuento = 0.04;
            sub= sueldo*descuento;
            sueldof=sueldo-sub;
        }
       System.out.println("El sueldo del empleado es: "+ sueldof);
    }
    
}
