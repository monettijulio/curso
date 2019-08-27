/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_generico_herenciamultiple_0;

/**
 *
 * @author julio
 */
public class Ej_Generico_HerenciaMultiple_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        M miObjeto = new M();
        miObjeto.contenedor.add( 
                        new A(){
                                public String muestra1(){
                                    System.out.println("soy el metodo muestra1()");
                                    return "";
                                }
                            }
                        );
        
        
        //activar metodo
        A a1 = (A)miObjeto.contenedor.get(0);
        a1.muestra1();
        
    }
    
}
