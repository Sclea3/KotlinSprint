package seventhLesson

fun main() {
    while (true) {
        val codeGen = (1000..9999).random()
        println("Ваш код авторизации: $codeGen")
        println("Введите код авторизации:")
        val inputCode = readln().toInt()

        if (inputCode == codeGen) {
            println("Добро пожаловать")
            break
        } else {
            println("Введите код заново")
        }
    }
}
