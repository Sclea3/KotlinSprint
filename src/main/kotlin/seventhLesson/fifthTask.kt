package seventhLesson

fun main() {
    println("Введите длину пароля:")
    val userInput = readln().toInt()
    val pool = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    var passw = ""

    for (i in 1..userInput) {
        val charForPassw = pool.random().toString()
        passw += charForPassw
    }
    println(passw)
}