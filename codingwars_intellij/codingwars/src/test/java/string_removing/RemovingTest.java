package string_removing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemovingTest {

    @Test
    void removeExclamationMarks() {
        assertEquals("Hello World", Removing.removeExclamationMarks("Hello World!"));
        assertEquals("HelloUniverse", Removing.removeExclamationMarks("Hello!Universe!!"));
    }

    @Test
    void removeExclamationMarksWithNull() {
        assertEquals("Hello World", Removing.removeExclamationMarksNullSafe("Hello World!"));
        assertEquals("HelloUniverse", Removing.removeExclamationMarksNullSafe("Hello!Universe!!"));
        assertEquals(null, Removing.removeExclamationMarksNullSafe(null));
    }

    @Test
    void removeSpacesWithNull() {
        assertEquals("8j8mBliB8gimjB8B8jlB", Removing.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", Removing.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", Removing.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", Removing.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", Removing.noSpace("8j aam"));
        assertEquals(null, Removing.removeExclamationMarksNullSafe(null));
    }
}