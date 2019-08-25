/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_genericos_0_typeerasure;

/**
 *
 * @author julio
 */
public class Ej_Genericos_0_TypeErasure {

   
  
    public static <E> boolean contieneElemento(E[] elements, E element) {
        for (E e : elements) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }
    //cuando este método anterior sea compilado generará
    /*
    public static  boolean contieneElemento(Object [] elements, Object element){
        for (Object e : elements){
            if(e.equals(element)){
                return true;
            }
        }
        return false;
    }
    */
    //Cuando se compila, el tipo E independiente se reemplaza con un tipo real Object

    

    public static void main(String[] args) {
        Persona p[] = new Persona[2];

        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        p[0] = p1;
        p[1] = p2;

        System.out.println(contieneElemento(p, p1));
 
    }

}
