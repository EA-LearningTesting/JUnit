/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nainjunit;

/**
 *
 * @author eslem
 */
public class ArithClass {
    
    
    public int multiply(int x, int y){
        if(x>999)
            throw new IllegalArgumentException("X should be less than 1000");
        
        return x*y;
    }
}
