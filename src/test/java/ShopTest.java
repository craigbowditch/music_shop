import org.junit.Before;
import org.junit.Test;
import stock.accessories.Tuner;
import stock.instruments.InstrumentType;
import stock.instruments.Piano;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Tuner tuner;
    Piano piano;

    @Before
    public void before() throws Exception {
        shop = new Shop();
        tuner = new Tuner(8.00, 14.00, "Pedal Tuner", "Boss");
        piano = new Piano(550.00, 710.00,"Spruce", "Black", InstrumentType.KEYBOARD, "Yamaha",  88);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddSellableItemToStock() {
        shop.add(tuner);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.add(tuner);
        shop.add(piano);
        assertEquals(2, shop.stockCount());
        shop.remove(piano);
        assertEquals(1, shop.stockCount());
    }

        @Test
    public void canCalculateTotalPotentialProfit() {
        shop.add(tuner);
        shop.add(piano);
        assertEquals(166.00, shop.calculateTotalPotentialProfit(), 0.01);
    }
}
