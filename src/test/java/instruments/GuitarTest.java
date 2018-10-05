package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() throws Exception {
        guitar = new Guitar("Wood", "Sunburst", InstrumentType.STRING, "Martin", 6);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Sunburst", guitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasMake() {
        assertEquals("Martin", guitar.getMake());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Jimi Hendrix screaming solo", guitar.play());
    }
}
