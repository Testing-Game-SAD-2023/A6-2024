import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalcolatrice {
    private static Calcolatrice cut;

    @BeforeClass
    public static void setupClass() {
        cut = new Calcolatrice();
    }
    @AfterClass
    public static void tearDownClass(){
        cut = null;
    }

    @Test
    public void testDivide() {
        int result = cut.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivideByZero() {
        aassertThrows(ArithmeticException.class,()->cut.divide(10,0));
    }
}