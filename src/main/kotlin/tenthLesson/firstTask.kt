package tenthLesson

fun main() {
    val userRoll = rollTheDice1()
    println("Бросок игрока: $userRoll")
    val computerRoll = rollTheDice1()
    println("Бросок компьютера: $computerRoll")
    when {
        userRoll > computerRoll -> println("Победило человечество")
        userRoll < computerRoll -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

fun rollTheDice1(): Int {
    return (1..6).random()
}