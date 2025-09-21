package seventhLesson

fun main() {
    println("Введите длину пароля (не менее 6):")
    val userInput = readln().toInt()
    if (userInput < 6) {
        println("Длина пароля не может быть меньше 6 символов")
        return
    }
    val lowercase = ('a'..'z')
    val uppercase = ('A'..'Z')
    val digits = ('0'..'9')

    var passw = ""

    passw += lowercase.random()
    passw += uppercase.random()
    passw += digits.random()

    val pool = lowercase + uppercase + digits
    for (i in 4..userInput) {
        passw += pool.random()
    }

    passw = passw.toList().shuffled().joinToString("")

    println(passw)
}