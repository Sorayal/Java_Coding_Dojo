package fake_binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakeBinaryTest {

    @Test
    void fakeBin() {
        assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", FakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", FakeBinary.fakeBin("366058562030849490134388085"));
    }

    @Test
    void fakeBinAsStream() {
        assertEquals("01011110001100111", FakeBinary.fakeBinAsStream("45385593107843568"));
        assertEquals("101000111101101", FakeBinary.fakeBinAsStream("509321967506747"));
        assertEquals("011011110000101010000011011", FakeBinary.fakeBinAsStream("366058562030849490134388085"));
    }

    @Test
    void fakeBinReplaceAll() {
        assertEquals("01011110001100111", FakeBinary.fakeBinReplaceAll("45385593107843568"));
        assertEquals("101000111101101", FakeBinary.fakeBinReplaceAll("509321967506747"));
        assertEquals("011011110000101010000011011", FakeBinary.fakeBinReplaceAll("366058562030849490134388085"));
    }
}