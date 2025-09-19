package sixthLesson

fun main() {
    println("Введите желаемый логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val userPass = readln()
    println("Регистрация завершена")

    while (true) {
        println("Введите логин:")
        val inputLogin = readln()
        println("Введите пароль:")
        val inputPassword = readln()

        if (inputLogin == userLogin && inputPassword == userPass) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверный логин или пароль. Попробуйте снова")
        }
    }
}