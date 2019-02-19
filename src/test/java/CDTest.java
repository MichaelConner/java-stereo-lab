import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDTest {

    CD cd;

    @Before
    public void before(){
        cd = new CD("Sony", "SuperCDBoi", 10);
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", cd.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("SuperCDBoi", cd.getModel());
    }

    @Test
    public void canGetNumberOfCDs(){
        assertEquals(10, cd.getNumberOfCDs());
    }


}
