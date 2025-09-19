package seventhLesson

fun main() {
    println("Введите кол-во секунд:")
    val userInput = readln().toInt()

    for (i in userInput downTo 0) {
        Thread.sleep(1000)
        println("Осталось секунд: $i")
    }
    println("Время вышло")
}