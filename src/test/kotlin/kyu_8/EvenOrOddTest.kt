package kyu_8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class EvenOrOddTest {

    @Test
    fun test() {
        assertEquals("Odd", evenOrOdd(1))
        assertEquals("Odd", evenOrOdd(11))
        assertEquals("Even", evenOrOdd(0))
        assertEquals("Even", evenOrOdd(-2))
        assertEquals("Odd", evenOrOdd(-11))
    }
}