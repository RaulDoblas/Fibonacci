package org.rdoblas.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    private void setup() { fibonacci = new Fibonacci(); }

    @AfterEach
    private void quit() { fibonacci = null;}

    @Test
    public void testComputeReturnTwoIfTheNumberIsThree(){
        int expectedValue = 2;
        int obtainValue = fibonacci.compute(3);

        assertEquals(expectedValue,obtainValue);
    }

    @Test
    public void testComputeReturnEightIfTheNumberIsSix(){
        int expectedValue = 8;
        int obtainValue = fibonacci.compute(6);

        assertEquals(expectedValue,obtainValue);
    }

    @Test
    public void testComputeReturn21IfTheNumberIsEight(){
        int expectedValue = 21;
        int obtainValue = fibonacci.compute(8);

        assertEquals(expectedValue,obtainValue);
    }

    @Test
    public void shouldComputeOfANegativeNumberRaiseAnException(){
        assertThrows(RuntimeException.class,() -> fibonacci.compute(-1));
    }
}
