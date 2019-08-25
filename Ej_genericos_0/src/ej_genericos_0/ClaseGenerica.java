/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_genericos_0;

interface InterfazGenerica<T1, T2>
{
   T2 metodo1(T1 t);
   T1 metodo2(T2 t);
}
 
//La clase implementa la interfaz genérica
class ClaseGenerica implements InterfazGenerica<String, Integer>
{
   
   public Integer metodo1(String t)
   {
      return new Integer(1);
   }
   
   public String metodo2(Integer t)
   {
      return new String("1");
   }
}