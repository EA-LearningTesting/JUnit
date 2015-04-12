/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nainjunit;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author eslem
 */
@RunWith(Parameterized.class)
public class MyParameterizedArithClassTest {

    private int multiplier;

    public MyParameterizedArithClassTest(int testParameter) {
        this.multiplier = testParameter;
    }
// creates the test data

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{1}, {5}, {78798}}; //through erro for being higher than 999
        return Arrays.asList(data);
    }

    @Test
    public void testMultiplyException() {
        ArithClass tester = new ArithClass();
        assertEquals("Result", multiplier * multiplier,
                tester.multiply(multiplier, multiplier));
    }

}
