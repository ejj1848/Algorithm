package Logan;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FBuzz fb;
    @Before
    public void setUp(){
        FBuzz fb = new FBuzz();
    }
    @Test
    public void canEvaluate(){
        assertNotNull(fb.evaluate());
    }

}
