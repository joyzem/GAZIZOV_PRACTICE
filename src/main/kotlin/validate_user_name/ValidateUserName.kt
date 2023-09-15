package validate_user_name

fun validateUserName(userName: String): Boolean {
    val regex = Regex("(?:[a-z]|_|\\d){4,16}")
    return userName.matches(regex)
}