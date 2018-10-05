package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() throws Exception {
        trumpet = new Trumpet("Yellow Brass", "Natural", InstrumentType.BRASS, "Stradivarius", 100.00, 135.00, 3);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Yellow Brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Natural", trumpet.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void hasMake() {
        assertEquals("Stradivarius", trumpet.getMake());
    }

    @Test
    public void HasNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(100.00, trumpet.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(135.00, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Parp", trumpet.play());
    }
}
