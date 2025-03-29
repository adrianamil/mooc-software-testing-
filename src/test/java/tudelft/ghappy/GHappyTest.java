package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GHappyTest {

    private final GHappy gHappy = new GHappy();

    @Test
    public void testMultipleGsTogether() {
        assertTrue(gHappy.gHappy("xxggxx"));
    }

    @Test
    public void testSingleG() {
        assertFalse(gHappy.gHappy("xxgxx"));
    }

    @Test
    public void testGNotHappyAtEnd() {
        assertFalse(gHappy.gHappy("xxggyygxx"));
    }

    @Test
    public void testAllGs() {
        assertTrue(gHappy.gHappy("gggg"));
    }

    @Test
    public void testSingleGEdge() {
        assertTrue(gHappy.gHappy("g"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(gHappy.gHappy(""));
    }
}
