/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_metodosgenericos_0_comparador;

/**
 *
 * @author julio
 */
public class Comparador {
    public <K, V> boolean compare(Pais<K, V> a, Pais<K, V> b){
        
    return a.pbi.equals(b.pbi) && a.continente.equals(b.continente);
  }

    
}
