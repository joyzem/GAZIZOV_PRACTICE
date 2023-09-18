package credit_card_mask

private const val VISIBLE_NUMBERS_COUNT = 4

/**
 * https://www.codewars.com/kata/5412509bd436bd33920011bc
 */
fun addCreditCardMask(input: String): String {
    val endIndex = input.length - VISIBLE_NUMBERS_COUNT
    return input.foldIndexed("") { index: Int, acc: String, c: Char ->
        acc + if (index < endIndex) "#" else c.toString()
    }
}
