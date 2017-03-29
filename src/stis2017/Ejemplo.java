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
public class Ejemplo {

    public void mostrar() {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
        System.out.println("El resultado del proceso es: "
                + String.valueOf(verificar(num1, num2)));
    }

    public int verificar(int num1, int num2) {
        int resultado = 0;
        if (num1 == num2) {
            resultado = num1 + num2;
        } else {
            resultado = num1 * num2;
        }
        return resultado;
    }

}
