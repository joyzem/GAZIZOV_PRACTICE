package format_number

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FormatNumberTest {

    @Test
    fun test() {
        assertEquals("(123) 456-7890", createPhoneNumber(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)))
    }
}