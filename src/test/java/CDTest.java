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

    @Test
    public void canPlay(){
        assertEquals("I am playing", cd.play());
    }

    @Test
    public void canPause(){
        assertEquals("I am paused", cd.pause());
    }

    @Test
    public void canEject(){
        assertEquals("You have ejected these little shiny discs that some people call music circles", cd.eject());
    }

}
