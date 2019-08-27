/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_instanciacion_generico_0;

class A<T> {

    String obj = "Hola";

    public Object metodo() throws Exception {

        T objeto = (T) obj.getClass().newInstance();

        return objeto;
    }
}

public class Ej_instanciacion_Generico_0 {

    public static void main(String[] args) {

        A a1 = new A();
        
        System.out.println("El miembro del objeto a1 es de tipo: " + a1.obj.getClass().getName());
    }

}
