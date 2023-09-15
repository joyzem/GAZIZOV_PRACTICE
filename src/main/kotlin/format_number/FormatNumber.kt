package format_number

/**
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83
 */
fun createPhoneNumber(array: List<Int>): String {
    val operator = array.subList(0,3).joinToString(separator = "")
    val threeDigits = array.subList(3,6).joinToString(separator = "")
    val fourDigits = array.subList(6,10).joinToString(separator = "")
    return "($operator) $threeDigits-$fourDigits"
}
