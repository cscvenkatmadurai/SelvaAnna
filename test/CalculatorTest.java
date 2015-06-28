import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by HARISH on 6/28/2015.
 */
public class CalculatorTest {
    @Test
    public  void shouldTestAdd(){
        assertEquals(15.0, new Calculator(5, 10).add());//ctrl+alt+n inline ctrl+alt+v extract var
    }
}
