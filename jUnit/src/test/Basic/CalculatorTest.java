package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    Calculator c=new Calculator();
    @Test
    void add() {
        assertEquals(5,c.add(2,3));
    }

   @Test
    void subtract() {
        assertEquals(5,c.subtract(8,3));
    }

   @Test
    void multiply() {
        assertEquals(6,3,3);
    }

    @Test
    void divide() {
        assertEquals(2,2,4);
    }
}