/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nainjunit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eslem
 */
public class ArithClassTest {

    /**
     * Test of multiply method, of class ArithClass.
     */
    @Test
    public void testMultiply() {
        ArithClass instance = new ArithClass();
        assertEquals("10 x 5 must be 50", 50, instance.multiply(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        ArithClass tester = new ArithClass();
        tester.multiply(1000, 5);
    }

}
