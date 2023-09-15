package kyu_8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class EvenOrOddTest {

    @Test
    fun test() {
        assertEquals("Even", evenOrOdd(1))
        assertEquals("Even", evenOrOdd(11))
        assertEquals("Odd", evenOrOdd(0))
        assertEquals("Odd", evenOrOdd(-2))
        assertEquals("Even", evenOrOdd(-11))
    }
}