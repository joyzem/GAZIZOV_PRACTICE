package kyu_8

import kotlin.test.Test
import kotlin.test.assertEquals

internal class DutyFreeTest {

    @Test
    fun test() {
        assertEquals(166, dutyFree(12, 50, 1000))
        assertEquals(294, dutyFree(17, 10, 500))
        assertEquals(357, dutyFree(24, 35, 3000))
        assertEquals(60, dutyFree(377, 40, 9048))
        assertEquals(10, dutyFree(2479, 51, 13390))
    }
}