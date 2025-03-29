package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    private final CaesarShiftCipher cipher = new CaesarShiftCipher();

    @Test
    public void testPositiveShift() {
        assertEquals("def", cipher.CaesarShiftCipher("abc", 3));
    }

    @Test
    public void testNegativeShift() {
        assertEquals("abc", cipher.CaesarShiftCipher("def", -3));
    }

    @Test
    public void testShiftWithWrapAround() {
        assertEquals("abc", cipher.CaesarShiftCipher("xyz", 3));
    }

    @Test
    public void testSpaceCharacter() {
        assertEquals("a b c", cipher.CaesarShiftCipher("x y z", 3));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("invalid", cipher.CaesarShiftCipher("abc123", 3));
    }

    @Test
    public void testEmptyMessage() {
        assertEquals("", cipher.CaesarShiftCipher("", 3));
    }

    @Test
    public void testLargeShiftValue() {
        assertEquals("def", cipher.CaesarShiftCipher("abc", 29));  // 29 % 26 = 3
    }
}
