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

public class Matricez {
    public void iniciar(){
    Scanner sc = new Scanner (System.in); 
    int matriz [][] = new int[4][4];
    int matrizT[][] = new int[4][4];
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            System.out.println("Ingrese el valor en la posicion"+i+","+j);
            matriz[i][j]=sc.nextInt();
        }  
    }
    System.out.println("La matriz ingresada es: ");
        mostrarmatriz(matriz);
        matrizT=transponermatriz(matriz);
        System.out.println("La matriz transpuesta es: ");
        mostrarmatriz(matrizT);
        
    }
    public void mostrarmatriz(int matriz[][]){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(j==3){
                    System.out.println(matriz[i][j]);
                }
                else{
                    System.out.print(matriz[i][j]+",");
                }
            }
        }
    }
    public int[][] transponermatriz(int matriz[][]){
        int matrizT[][]=new int[4][4];
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                matrizT[j][i]=matriz[i][j];
            }
        }
        return matrizT;
    }
}
