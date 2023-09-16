package kyu_7

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

internal class SpiralingBoxTest {

    @Test
    fun sampleTests() {
        val box_7_8 = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1, 1),
            intArrayOf(1, 2, 2, 2, 2, 2, 1),
            intArrayOf(1, 2, 3, 3, 3, 2, 1),
            intArrayOf(1, 2, 3, 4, 3, 2, 1),
            intArrayOf(1, 2, 3, 4, 3, 2, 1),
            intArrayOf(1, 2, 3, 3, 3, 2, 1),
            intArrayOf(1, 2, 2, 2, 2, 2, 1),
            intArrayOf(1, 1, 1, 1, 1, 1, 1)
        )

        val box_8_7 = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 1),
            intArrayOf(1, 2, 2, 2, 2, 2, 2, 1),
            intArrayOf(1, 2, 3, 3, 3, 3, 2, 1),
            intArrayOf(1, 2, 3, 4, 4, 3, 2, 1),
            intArrayOf(1, 2, 3, 3, 3, 3, 2, 1),
            intArrayOf(1, 2, 2, 2, 2, 2, 2, 1),
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)
        )

        val box_4_2 = arrayOf(intArrayOf(1, 1, 1, 1), intArrayOf(1, 1, 1, 1))
        val box_2_4 = arrayOf(intArrayOf(1, 1), intArrayOf(1, 1), intArrayOf(1, 1), intArrayOf(1, 1))

        assertArrayEquals(box_7_8, spiralingBox(7, 8))
        assertArrayEquals(box_8_7, spiralingBox(8, 7))
        assertArrayEquals(box_4_2, spiralingBox(4, 2))
        assertArrayEquals(box_2_4, spiralingBox(2, 4))
    }
}