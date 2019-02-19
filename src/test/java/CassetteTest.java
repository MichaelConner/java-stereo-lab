import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassetteTest {

    Cassette cassette;

    @Before
    public void before(){
        cassette = new Cassette("OldBoi", "Kentucky200", 70);
    }

    @Test
    public void canGetMake(){
        assertEquals("OldBoi", cassette.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Kentucky200", cassette.getModel());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(70, cassette.getCapacity());
    }

    @Test
    public void canPlay(){
        assertEquals("I am playing", cassette.play());
    }

    @Test
    public void canPause(){
        assertEquals("I am paused", cassette.pause());
    }

    @Test
    public void canEject(){
        assertEquals("You have ejected this cassette", cassette.eject());
    }


}
