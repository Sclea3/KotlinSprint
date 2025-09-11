package fifthLesson

fun main() {
    val winNumbersList = List(3) {(0..42).random()}
    print(winNumbersList)
    println("Введите числа для розыгрыша")
    val userInputList = List(3) {readLine() ?: ""}
    println(userInputList)
}