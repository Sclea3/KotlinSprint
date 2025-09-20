package sixthLesson

fun main() {
    println("Введите кол-во секунд:")
    val neededSeconds = readln().toInt()
    Thread.sleep(1000L * neededSeconds)
    println("Прошло $neededSeconds секунд")
}