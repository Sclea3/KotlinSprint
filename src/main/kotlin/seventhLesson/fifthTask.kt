package seventhLesson

fun main() {
    println("Введите длину пароля (не менее 6):")
    val userInput = readln().toInt()
    if (userInput < 6) {
        println("Длина пароля не может быть меньше 6 символов")
    }
    val pool = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    var passw = ""

    for (i in 1..userInput) {
        val charForPassw = pool.random().toString()
        passw += charForPassw
    }
    println(passw)
}