import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd(){
        double actual=Calculator.add(2.0,3.0);
        assertEquals(5.0,actual);
        System.out.println("Test Passed ");
        System.out.println("Expected "+5.0);
        System.out.println("Actual "+actual);
    }

    @Test
    public void testSub(){
        double actual=Calculator.sub(5.0,3.0);
        assertEquals(2.0,actual);
        System.out.println("Subtraction Test Passed ");
        System.out.println("Expected "+2.0);
        System.out.println("Actual "+actual);
    }

    @Test
    public void multiplyTest(){
        double actual=Calculator.multiple(5.0,3.0);
        assertEquals(15.0,actual);
        System.out.println("Multiplication Test Passed ");
        System.out.println("Expected "+15.0);
        System.out.println("Actual "+actual);
    }

    @Test
    public void divisionTest(){
        double actual=Calculator.divide(6.0,3.0);
        assertEquals(2.0,actual);
        System.out.println("Division Test Passed ");
        System.out.println("Expected "+2.0);
        System.out.println("Actual "+actual);
    }
    @Test
    public void dividewithZero(){
        assertThrows(IllegalArgumentException.class, ()->{Calculator.divide(6.0,0.0);});
        System.out.println("Division by Zero handles exception");
    }
}
