package credit_card_mask

import kotlin.test.Test
import kotlin.test.assertEquals

internal class CreditCardMaskTest {

    @Test
    fun `full card number`() {
        val input = "4556364607935616"
        val output = "############5616"
        assertEquals(output, addCreditCardMask(input))
    }

    @Test
    fun `short card number`() {
        val input = "64607935616"
        val output = "#######5616"
        assertEquals(output, addCreditCardMask(input))
    }

    @Test
    fun `one digit`() {
        val input = "1"
        val output = "1"
        assertEquals(output, addCreditCardMask(input))
    }

    @Test
    fun `empty string`() {
        val input = ""
        val output = ""
        assertEquals(output, addCreditCardMask(input))
    }
}