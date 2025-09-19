package sixthLesson

fun main() {
    println("Введите кол-во секунд:")
    val neededSeconds = readln().toInt()

    for (sec in neededSeconds downTo 1) {
        println("Осталось секунд: $sec")
        Thread.sleep(1000)
    }
    println("Время вышло")
}