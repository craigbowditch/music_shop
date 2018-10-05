package instruments;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.Guitar;
import stock.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() throws Exception {
        guitar = new Guitar(120.00, 250.00,"Wood", "Sunburst", InstrumentType.STRING, "Martin",  6);
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
    public void hasBuyingPrice() {
        assertEquals(120.00, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(250.00, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Jimi Hendrix screaming solo", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(130.00, guitar.calculateMarkup(),0.01);
    }
}
