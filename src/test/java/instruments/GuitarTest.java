package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() throws Exception {
        guitar = new Guitar(6);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }
}
