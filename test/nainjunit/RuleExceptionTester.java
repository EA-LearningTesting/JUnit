/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nainjunit;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author eslem
 */
public class RuleExceptionTester {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void throwsIllegalArgumentExceptionIfXHigherThan999() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("X should be less than 1000");
        ArithClass t = new ArithClass();
        t.multiply(10000, 0);
    }
}
