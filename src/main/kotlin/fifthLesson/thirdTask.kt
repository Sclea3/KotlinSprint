package fifthLesson

const val FIRST_WIN_NUMBER = 32
const val SECOND_WIN_NUMBER = 14

fun main() {
    println("Введите первое число:")
    val firstInput = readLine()!!.toInt()

    println("Введите второе число:")
    val secondInput = readLine()!!.toInt()

    if ((firstInput == FIRST_WIN_NUMBER && secondInput == SECOND_WIN_NUMBER) ||
        (firstInput == SECOND_WIN_NUMBER && secondInput == FIRST_WIN_NUMBER)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstInput == FIRST_WIN_NUMBER || firstInput == SECOND_WIN_NUMBER ||
        secondInput == FIRST_WIN_NUMBER || secondInput == SECOND_WIN_NUMBER) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}
