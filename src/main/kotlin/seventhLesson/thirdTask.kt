package seventhLesson

fun main() {
    println("Введите число:")
    val userInput = readln().toInt()

    for (i in 0..userInput step 2) {
        println(i)
    }
}