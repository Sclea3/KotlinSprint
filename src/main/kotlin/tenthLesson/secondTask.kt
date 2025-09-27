package tenthLesson

fun main() {
    println("Введите логин:")
    val checkLogin = validateInput(readln())
    if (checkLogin) {
        println("Логин недостаточно длинный")
        return
    }
    println("Введите пароль:")
    val checkPassword = validateInput(readln())
    if (checkPassword) {
        println("Пароль недостаточно длинный")
    }
}

fun validateInput(input: String): Boolean {
    return (input.length < 4)
}