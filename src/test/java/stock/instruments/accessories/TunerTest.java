package stock.instruments.accessories;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.Tuner;

import static org.junit.Assert.assertEquals;

public class TunerTest {

    Tuner tuner;

    @Before
    public void before() throws Exception {
        tuner = new Tuner(8.00, 14.00, "Pedal Tuner", "Boss");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(8.00, tuner.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(14.00, tuner.getSellingPrice(), 0.01);
    }

    @Test
    public void hasType() {
        assertEquals("Pedal Tuner", tuner.getType());
    }

    @Test
    public void hasMake() {
        assertEquals("Boss", tuner.getMake());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(6.00, tuner.calculateMarkup(),0.01);
    }
}
