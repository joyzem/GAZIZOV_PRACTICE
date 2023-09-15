package validate_user_name

fun validateUserName(userName: String): Boolean {
    return userName.matches("(?:[a-z]|_|\\d){4,16}".toRegex())
}