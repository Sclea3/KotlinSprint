package tenthLesson

const val ADMIN_LOGIN = "admin"
const val ADMIN_PASSWORD = "admin"

fun main() {
    println("Введите логин:")
    val userInputLogin = readln()
    println("Введите пароль:")
    val userInputPassword = readln()

    val token = userAuthorization(userInputLogin, userInputPassword)
    if (token == null) {
        println("Неудачная авторизация")
        return
    }

    val cart = sendGroceries(token)
    println("Содержимое корзины: ${cart.joinToString(", ")}")
}

fun generateToken32(): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    return (1..32).map { chars.random() }.joinToString("")
}

fun userAuthorization(username: String, password: String): String? {
    if (username != ADMIN_LOGIN || password != ADMIN_PASSWORD) return null
    return generateToken32()
}

fun sendGroceries(token: String): List<String> {
    require(token.length == 32) { "Неверный токен" }
    val groceriesList = listOf("капуста", "глюканат натрия", "е325")
    return groceriesList
}