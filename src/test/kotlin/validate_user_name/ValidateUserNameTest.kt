package validate_user_name

import kotlin.test.Test
import kotlin.test.assertEquals

internal class ValidateUserNameTest {

    @Test
    fun test() {
        assertEquals(true, validateUserName("1asdf"))
        assertEquals(true, validateUserName("____"))
        assertEquals(true, validateUserName("aaaa"))
        assertEquals(false, validateUserName("aaa"))
        assertEquals(true, validateUserName("aaa1_23489u_"))
        assertEquals(false, validateUserName("aAa1_23489u_"))
        assertEquals(false, validateUserName(""))
        assertEquals(false, validateUserName("a_______a1_23489u_"))
    }
}