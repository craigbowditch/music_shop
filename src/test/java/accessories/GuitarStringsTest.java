package accessories;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() throws Exception {
        guitarStrings = new GuitarStrings(4.00, 6.00, "Nylon", "Ernie Ball", "Super Light");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(4.00, guitarStrings.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(6.00, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void hasType() {
        assertEquals("Nylon", guitarStrings.getType());
    }

    @Test
    public void hasMake() {
        assertEquals("Ernie Ball", guitarStrings.getMake());
    }

    @Test
    public void hasGauge() {
        assertEquals("Super Light", guitarStrings.getGauge());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2.00, guitarStrings.calculateMarkup(),0.01);
    }
}
