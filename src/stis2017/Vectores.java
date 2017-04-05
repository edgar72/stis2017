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
public class Vectores {
    public void mostrar(){
        Scanner sc = new Scanner (System.in);
        int dimension=0;
        System.out.println("Ingrese la dimension del vector");
        dimension=sc.nextInt();
        int vector[]= new int[dimension];
        for(int i=1; i<=dimension; i++){
            System.out.println("Ingrese el numero"+1);
            vector[i]=sc.nextInt();
        }
        
    }
}
