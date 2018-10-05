package stock.instruments;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.InstrumentType;
import stock.instruments.Saxophone;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() throws Exception {
        saxophone = new Saxophone(350.00, 480.00,"Yellow Brass", "Natural", InstrumentType.WOODWIND, "Selmer",  "Single");
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

    @Test
    public void hasBuyingPrice() {
        assertEquals(350.00, saxophone.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(480.00, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Careless whisper eat your heart out", saxophone.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(130.00, saxophone.calculateMarkup(),0.01);
    }
}
