package fifthLesson

fun main() {
    val winNumbersList = List(3) {(0..42).random()}
    println("Введите числа для розыгрыша")
    val userInputList = List(3) {readLine()?.toIntOrNull() ?:0}
    val result = winNumbersList.intersect(userInputList)

    when (result.size) {
        0 -> println("Вы не угадали ни одного числа")
        1 -> println("Выплата утешительного приза")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        else -> println("Вы угадали все числа и выиграли джекпот!")
    }
    println("Выиграшные числа: $winNumbersList")
}