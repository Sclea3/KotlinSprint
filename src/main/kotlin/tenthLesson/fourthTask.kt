package tenthLesson

fun main() {
    var humanWins = 0

    while (true) {
        val userRoll = rollTheDice()
        println("Бросок игрока: $userRoll")

        val computerRoll = rollTheDice()
        println("Бросок компьютера: $computerRoll")

        if (calculateResult(userRoll, computerRoll)) {
            humanWins++
        }

        println("Хотите сыграть еще? Введите \"Да\" либо \"Нет\"")
        val userInput = readln().lowercase()
        if (userInput != "да") {
            break
        }
    }

    println("Вы выиграли партий: $humanWins")
}

fun rollTheDice(): Int {
    return (1..6).random()
}

fun calculateResult(userRoll: Int, computerRoll: Int): Boolean {
    return when {
        userRoll > computerRoll -> {
            println("Победило человечество")
            true
        }
        userRoll < computerRoll -> {
            println("Победила машина")
            false
        }
        else -> {
            println("Победила дружба")
            false
        }
    }
}
