package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() throws Exception {
        piano = new Piano("Spruce", "Black", InstrumentType.KEYBOARD, "Yamaha", 550.00, 710.00, 88);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Spruce", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void hasMake() {
        assertEquals("Yamaha", piano.getMake());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(550.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(710.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Bachesque wizardry", piano.play());
    }
}
