package format_number

fun createPhoneNumber(array: List<Int>): String {
    val operator = array.subList(0,3).joinToString(separator = "")
    val threeDigits = array.subList(3,6).joinToString(separator = "")
    val fourDigits = array.subList(6,10).joinToString(separator = "")
    return "($operator) $threeDigits-$fourDigits"
}