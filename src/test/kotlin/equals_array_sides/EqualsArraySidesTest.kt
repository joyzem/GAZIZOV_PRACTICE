package equals_array_sides

import kotlin.test.Test
import kotlin.test.assertEquals

internal class EqualsArraySidesTest {

    @Test
    fun test() {
        assertEquals(3, indexOfEqualArraySides(intArrayOf(1, 2, 3, 4, 3, 2, 1)))
        assertEquals(1, indexOfEqualArraySides(intArrayOf(1, 100, 50, -51, 1, 1)))
        assertEquals(-1, indexOfEqualArraySides(intArrayOf(1, 2, 3, 4, 5, 6)))
        assertEquals(3, indexOfEqualArraySides(intArrayOf(20, 10, 30, 10, 10, 15, 35)))
        assertEquals(-1, indexOfEqualArraySides(intArrayOf(-8505, -5130, 1926, -9026)))
        assertEquals(1, indexOfEqualArraySides(intArrayOf(2824, 1774, -1490, -9084, -9696, 23094)))
        assertEquals(6, indexOfEqualArraySides(intArrayOf(4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4)))
    }
}