/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_genericos_comparingbykey_0;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Ej_genericos_ComparingByKey_0 {

    public static void main(String[] argv) {
        Map<String, Integer> MapDesordenado = new HashMap<>();
        MapDesordenado.put("Ramon", 10);
        MapDesordenado.put("Miriam", 5);
        MapDesordenado.put("Alejandra", 6);
        MapDesordenado.put("Jesus", 20);
        MapDesordenado.put("Estela", 1);
        MapDesordenado.put("Rosario", 7);
        MapDesordenado.put("José Luis", 8);
        MapDesordenado.put("Hernán", 99);
        MapDesordenado.put("Luca", 50);
        MapDesordenado.put("Brian", 2);
        MapDesordenado.put("Martina", 9);

        System.out.println("Original...");
        System.out.println(MapDesordenado);

        // ordenar de acuerdo a las claves, a,b,c..., y regresar un LinkedHashMap
        // toMap() regresará un HashMap. Es necesario un LinkedHashMap para mantener el orden.
        Map<String, Integer> resultado0 = MapDesordenado.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (viejoValor, nuevoValor) -> viejoValor, LinkedHashMap::new));

        //Una alternativa para ordenar un Map de acuerdo a sus claves
        Map<String, Integer> resultado = new LinkedHashMap<>();
        MapDesordenado.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> resultado.put(x.getKey(), x.getValue()));

        System.out.println("Ordenado...");
        System.out.println(resultado0);
        System.out.println(resultado);

    }

}
