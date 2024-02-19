import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalcolatrice {
    private static Calcolatrice cut;
    static int a;
    static int b;
    static int expOutput;
    static int actOutput;

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
        a = 3;
        b = 1;
        expOutput = a/b;
        actOutput = cut.divide(a,b);
        assertEquals("ERR: not equals",expOutput,actOutput);
    }

    @Test
    public void testDivideByZero() {
        a = 3;
        b = 0;
        assertThrows(ArithmeticException.class,()->cut.divide(a,b));
    }
}