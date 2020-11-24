package org.niksu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void shouldAnswerWithTrue()
    {
        int val1 = 4;
        int val2 = Calculator.addition(3,1);
        System.out.println("Expected : " + val1);
        System.out.println("Returned : " + val2);
        assertEquals(val1,val2);
    }
}
