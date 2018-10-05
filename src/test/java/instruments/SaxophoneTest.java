package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() throws Exception {
        saxophone = new Saxophone("Single");
    }

    @Test
    public void hasTypeOfReed() {
        assertEquals("Single", saxophone.getTypeOfReed());
    }
}
