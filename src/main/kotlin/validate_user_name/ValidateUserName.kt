package validate_user_name

/**
 * https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023
 */
fun validateUserName(userName: String): Boolean {
    return userName.matches("(?:[a-z]|_|\\d){4,16}".toRegex())
}
