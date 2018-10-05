package accessories;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() throws Exception {
        drumSticks = new DrumSticks(10.00, 15.00, "Hot Rods", "Ahead", "Oak");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(10.00, drumSticks.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(15.00, drumSticks.getSellingPrice(), 0.01);
    }

    @Test
    public void hasType() {
        assertEquals("Hot Rods", drumSticks.getType());
    }

    @Test
    public void hasMake() {
        assertEquals("Ahead", drumSticks.getMake());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Oak", drumSticks.getMaterial());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5.00, drumSticks.calculateMarkup(),0.01);
    }
}
