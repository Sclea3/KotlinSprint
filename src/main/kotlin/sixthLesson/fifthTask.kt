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

    val maxIncorrectInputs = 3
    for (i in 1..maxIncorrectInputs) {
        val firstInt = (1..9).random()
        val secondInt = (1..9).random()
        val additionResult = firstInt + secondInt
        println("введите рез-тат сложения $firstInt и $secondInt")

        val userInput = readln().toIntOrNull()
        if (userInput == additionResult) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно")
        }
    }
    println("Доступ запрещён")
}