import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class MyUnitTest {

    @Test
     public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");
        int a = myUnit.calA(3, 4);
        assertEquals("onetwo", result);
        assertEquals(7,a);

    }

    @Test
    public void testCalc() {
        MyUnit myUnit = new MyUnit();
        int a = myUnit.calA(3, 4);
        assertEquals(7,a);

    }
}