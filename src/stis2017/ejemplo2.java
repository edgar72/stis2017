/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stis2017;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ejemplo2 {
    
    public void iniciar(){
        String base="";
        String altura="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        base = sc.nextLine();
        System.out.println("Ingrese la altura del rectangulo");
        altura= sc.nextLine();
        BigDecimal resultado= new BigDecimal(BigInteger.ZERO);
        if(!(ValidarNumero (base) && ValidarNumero(altura))){
            System.out.println("Recuerde que solo puede ingresar numeros");
        }
        else{
            resultado= new BigDecimal(base).multiply(new BigDecimal (altura));
            resultado= resultado.divide(new BigDecimal("2"));
            System.out.println("El resultado es: "+ resultado.toString());
        }
    }
    
    public boolean ValidarNumero(String num){
        boolean bandera=true;
        if(!num.equals("")){
            for(int i=0; i<num.length();i++){
                if(!Character.isDigit(num.charAt(i))){
                    bandera=false;
                }
            }
            
        }
        else{
            bandera=false;
        }
        return bandera;
    }
}
