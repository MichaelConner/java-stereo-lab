import org.junit.Before;

public class StereoTest {
    Stereo stereo;
    CD cd;
    Cassette cassette;
    Radio radio;

    @Before
    public void before(){
        stereo = new Stereo("Master Jam Blaster, esq");
        cd = new CD("Haiwaii", "HiFI", 10);
        cassette = new Cassette("Pony", "Express", 5);
        radio = new Radio("Sony", "Thingamajing");
        stereo.getComponents().add(cd);
        stereo.getComponents().add(radio);
        stereo.getComponents().add(cassette);
    }
    

}
