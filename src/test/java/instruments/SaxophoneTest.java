package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() throws Exception {
        saxophone = new Saxophone("Yellow Brass", "Natural", InstrumentType.WOODWIND, "Selmer", "Single");
    }

    @Test
    public void hasMaterial() {
        assertEquals("Yellow Brass", saxophone.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Natural", saxophone.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.WOODWIND, saxophone.getType());
    }

    @Test
    public void hasMake() {
        assertEquals("Selmer", saxophone.getMake());
    }

    @Test
    public void hasTypeOfReed() {
        assertEquals("Single", saxophone.getTypeOfReed());
    }
}
