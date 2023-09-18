package credit_card_mask

import kotlin.test.Test
import kotlin.test.assertEquals

internal class CreditCardMaskTest {
    @Test
    fun test() {
        assertEquals("############5616", addCreditCardMask("4556364607935616"));
        assertEquals("#######5616", addCreditCardMask("64607935616"));
        assertEquals("1", addCreditCardMask("1"));
        assertEquals("", addCreditCardMask(""));

        // "What was the name of your first pet?"
        assertEquals("##ippy", addCreditCardMask("Skippy"));
        assertEquals(
            "####################################man!",
            addCreditCardMask("Nananananananananananananananana Batman!")
        );
    }
}