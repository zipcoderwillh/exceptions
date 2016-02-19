import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by willhorton on 2/19/16.
 */
public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        assertEquals(Calculator.add(5, 5), 10);
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(Calculator.subtract(5, 5), 0);
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(Calculator.multiply(5, 5), 25);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(Calculator.divide(5, 5), 1);
    }

    @Test(expected = DivisionByZeroException.class)
    public void testDivisionByZeroException() throws Exception {
        Calculator.divide(5, 0);
    }

}