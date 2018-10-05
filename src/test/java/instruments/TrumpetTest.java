package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() throws Exception {
        trumpet = new Trumpet(3);
    }

    @Test
    public void HasNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }
}
