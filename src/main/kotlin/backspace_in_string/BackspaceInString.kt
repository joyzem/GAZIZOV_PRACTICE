package backspace_in_string

/**
 * https://www.codewars.com/kata/5727bb0fe81185ae62000ae3
 */
fun cleanString(s: String): String {
    var backspaceCount = 0
    return s.foldRight("") { current, acc ->
        if (current == '#') {
            backspaceCount++
            acc
        } else if (backspaceCount > 0) {
            backspaceCount--
            acc
        } else {
            current + acc
        }
    }
}
