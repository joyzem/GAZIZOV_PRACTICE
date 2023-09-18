package backspace_in_string

import kotlin.test.DefaultAsserter.assertEquals
import kotlin.test.Test
import kotlin.test.assertEquals

internal class BackspaceInStringTest {

    @Test
    fun testCleanString() {
        assertEquals("ac", cleanString("abc#d##c"));
        assertEquals("", cleanString("abc####d##c#"));
        assertEquals("", cleanString("#######"));
        assertEquals("", cleanString(""));
    }
}