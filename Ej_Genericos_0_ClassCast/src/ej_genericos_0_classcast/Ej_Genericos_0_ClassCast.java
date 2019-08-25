/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_genericos_0_classcast;

import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class Ej_Genericos_0_ClassCast {

    public static void main(String[] args) {
        ArrayList personas = new ArrayList();  //contenedor para objetos Persona
        
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Luis");
        
        personas.add( p1 );
        personas.add( p2 ); 
        personas.add( 40 );
        personas.add( p3 );
        
        for(int i=0; i<personas.size(); i++)
        {
            Persona p = (Persona) personas.get(i); //el lenguaje me pide el "casting explicito" al obtener el elemento del contenedor
            System.out.println( p.getNombre() );
        }
        
        //Tarea: corregir el error de procesamiento que lanza java.lang.ClassCastException
        
        
    }
    
}
