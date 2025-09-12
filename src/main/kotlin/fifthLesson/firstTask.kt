package fifthLesson

fun main() {
    val firstInt = (1..99).random()
    val secondInt = (1..99).random()
    println("Введите сумму двух чисел: $firstInt + $secondInt")
    val result = readLine()?.toIntOrNull()
    if (result == firstInt + secondInt) {
        println("Добро пожаловать!")
    }
    else {
        println("Доступ запрещён.")
    }
}