package backspace_in_string

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