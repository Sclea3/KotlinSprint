package tenthLesson

fun main() {
    val userRoll = rollTheDice()
    println("Бросок игрока: $userRoll")
    val computerRoll = rollTheDice()
    println("Бросок компьютера: $computerRoll")
    when {
        userRoll > computerRoll -> println("Победило человечество")
        userRoll < computerRoll -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

fun rollTheDice(): Int {
    return (1..6).random()
}