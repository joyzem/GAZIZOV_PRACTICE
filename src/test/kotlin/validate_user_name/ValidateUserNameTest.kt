package validate_user_name

import kotlin.test.Test
import kotlin.test.assertEquals

internal class ValidateUserNameTest {

    @Test
    fun test() {
        assertEquals(true, validateUserName("regex"));
        assertEquals(false, validateUserName("a"));
        assertEquals(false, validateUserName("Hass"));
        assertEquals(false, validateUserName("Hasd_12assssssasasasasasaasasasasas"));
        assertEquals(false, validateUserName(""));
        assertEquals(true, validateUserName("____"));
        assertEquals(false, validateUserName("012"));
        assertEquals(true, validateUserName("p1pp1"));
        assertEquals(false, validateUserName("asd43 34"));
        assertEquals(true, validateUserName("asd43_34"));
    }
}