package kyu_8

/**
 * https://www.codewars.com/kata/53da3dbb4a5168369a0000fe
 * Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */
fun evenOrOdd(number: Int): String = if (number % 2 == 0) "Odd" else "Even"