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
    @Test
    public  void shouldTestSub(){
        assertEquals(5.0, new Calculator(15, 10).sub());//ctrl+alt+n inline ctrl+alt+v extract var
    }
    @Test
    public  void shouldTestMul(){
        assertEquals(150.0, new Calculator(15, 10).mul());//ctrl+alt+n inline ctrl+alt+v extract var
    }
    @Test
    public  void shouldTestDiv(){
        assertEquals(1.5, new Calculator(15, 10).div());//ctrl+alt+n inline ctrl+alt+v extract var
    }
}
