/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_comodines_0;

/**
 *
 * @author julio
 */
public class Ej_Comodines_0 {

    public static void main(String[] args) {
        Operaciones<Integer> contenedorIntegers
                = new Operaciones<Integer>(5);
        Operaciones<Double> contenedorDoubles = new Operaciones<Double>(-5.0);
        Operaciones<Long> contenedorLongs = new Operaciones<Long>(4L);
        System.out.println("Comparando contenedorIntegers y contenedorDoubles");
        
        
        if (contenedorIntegers.igualAbs(contenedorDoubles)) {
            System.out.println("Los valores absolutos son iguales.");
        } else {
            System.out.println("Los valores absolutos son diferentes.");
        }
        
        System.out.println();
        
        System.out.println("Comparando contenedorIntegers y contenedorLongs");
        
        if (contenedorIntegers.igualAbs(contenedorLongs)) {
            System.out.println("Los valores absolutos son los mismos.");
        } else {
            System.out.println("Los valores absolutos son diferentes.");
        }
    }

}
