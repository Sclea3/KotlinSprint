package sixthLesson

fun main() {
    println("Введите кол-во секунд:")
    val neededSeconds = readln().toInt()

    for (i in 1..neededSeconds) {
        println("Секунда $i")
        Thread.sleep(1000)
    }
}