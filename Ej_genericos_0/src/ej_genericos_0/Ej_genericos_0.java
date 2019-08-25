/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_genericos_0;

import java.util.ArrayList;


public class Ej_genericos_0 {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        
        a.add(new Integer( 0 ));
        a.add(new String("Hola"));
        
        String miValor =  a.get(0);
        
    }
    
}
