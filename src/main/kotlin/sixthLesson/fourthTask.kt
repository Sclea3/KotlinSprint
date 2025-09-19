package sixthLesson

fun main() {
    var tryCounter = 5
    val guessedNumber = (1..9).random()

    while (tryCounter > 0) {
        println("У Вас пять попыток. Введите число:")
        val inputValue = readln().toIntOrNull()
        if (inputValue != guessedNumber) {
            tryCounter--
            println("Неверно, осталось $tryCounter попыток")
        } else {
            println("Это была великолепная игра!")
            break
        }
    }
    println("Было загадано число $guessedNumber")
}