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
public class Ej_MetodosGenericos_0_Comparador {

    public static void main(String[] args) {
        Pais<Integer, String> pais1, pais2;
        pais1 = new Pais<Integer, String>(30000000, "Europa");
        pais2 = new Pais<Integer, String>(22000000, "Asia");
        
        //supongo que dos paises son iguales si tienen el mismo pbi y estan en el mismo continente
        boolean iguales = new Comparador().compare(pais1, pais2);

    }

}
