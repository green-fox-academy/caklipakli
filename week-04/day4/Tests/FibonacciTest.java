import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void Fibonacci_Different_Values_Test() {

        Fibonacci doFibonacci = new Fibonacci();
        assertEquals(21, doFibonacci.Fibonacci(8));
    }

    @Test
    public void Fibonacci_0_Value_Test() {

        Fibonacci doFibonacci = new Fibonacci();
        assertEquals(0, doFibonacci.Fibonacci(0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void Fibonacci_Negative_Value() {
        Fibonacci doFibonacci = new Fibonacci();
        doFibonacci.Fibonacci(-2);
    }
}
