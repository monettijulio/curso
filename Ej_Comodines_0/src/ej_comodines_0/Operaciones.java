/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_comodines_0;

/**
 *
 * @author julio
 */
public class Operaciones <T extends Number>{
    T num;
    
    Operaciones( T n ){
        num=n;
    }

    //Devuelve el recíproco
    double reciproco(){
        return 1/num.doubleValue();
    }
    //Devuelve parte fraccionaria
    double fraccion(){
        return num.doubleValue()-num.intValue();
    }
    
    boolean igualAbs(Operaciones<?> ob){
        if(Math.abs(num.doubleValue())==Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
    
}