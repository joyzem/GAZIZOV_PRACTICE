package equals_array_sides

fun indexOfEqualArraySides(array: IntArray): Int {
    val defaultResult = -1
    var leftSideSum = 0
    val sum = array.sum()
    var index = 0
    for (i in array.indices) {
        val number = array[i]
        if (leftSideSum == sum - leftSideSum - number) {
            index = i
            break
        }
        leftSideSum += number
    }
    return if (leftSideSum == sum - leftSideSum - array.getOrElse(index) { 0 }) index else defaultResult

}