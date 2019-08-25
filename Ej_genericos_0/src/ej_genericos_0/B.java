/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_genericos_0;

public class B {

    public <T> int contarElementos(T[] arreglo, T item) {
        int contador = 0;
   
            for (T elemento : arreglo) {
                if (item.equals(elemento)) {
                    contador++;
                }
            }

            return contador;
    }
}
