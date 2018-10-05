package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() throws Exception {
        piano = new Piano(88);
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }
}
