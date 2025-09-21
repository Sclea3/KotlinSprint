package eighthLesson

fun main() {
    println("Сколько ингридиентов будете вводить?")
    val userDigitsCountInput = readln().toInt()

    if (userDigitsCountInput <= 0) {
        println("Некорректное количество чисел.")
        return
    }

    println("Введите по очереди свои числа:")
    val userDigitsArray = Array(userDigitsCountInput) { readln().toInt() }

    println("Введенный массив чисел:\n${userDigitsArray.joinToString(", ")}")
}