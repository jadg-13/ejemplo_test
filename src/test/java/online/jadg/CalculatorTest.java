package online.jadg;

import online.jadg.services.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0.0001); // margen de tolerancia para valores double
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(50, 10);
        assertEquals(40, result, 0.0001);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(10, 50);
        assertEquals(500, result, 0.0001);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(50, 10);
        assertEquals(5, result, 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(50, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}
