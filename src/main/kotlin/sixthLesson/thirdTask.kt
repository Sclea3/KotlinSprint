package sixthLesson

fun main() {
    println("Введите кол-во секунд:")
    val neededSeconds = readln().toInt()

    var i = 0
    var reverseCounter = 0
    while (i < neededSeconds) {
        reverseCounter = neededSeconds - i
        println("Осталось секунд: $reverseCounter")
        Thread.sleep(1000)
        i++
    }
    println("Время вышло")
}