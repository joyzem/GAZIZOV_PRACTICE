package kyu_7

/**
 * https://www.codewars.com/kata/63b84f54693cb10065687ae5/kotlin
 * Task
 * Given two positive integers m (width) and n (height), fill a two-dimensional list (or array) of size m-by-n in the following way:
 * (1) All the elements in the first and last row and column are 1.
 * (2) All the elements in the second and second-last row and column are 2, excluding the elements from step 1.
 * (3) All the elements in the third and third-last row and column are 3, excluding the elements from the previous steps.
 * And so on ...
 */
fun spiralingBox(m: Int, n: Int): Array<IntArray> {
    return Array(n) { ri ->
        IntArray(m) { ci ->
            val rowIndexValue = minOf(m - ci, ci + 1)
            val maxDigitOfRow = minOf(ri + 1, n - ri)
            minOf(rowIndexValue, maxDigitOfRow)
        }
    }
}
