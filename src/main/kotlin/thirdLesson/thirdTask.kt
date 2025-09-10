package thirdLesson

fun main() {
    val value = 3
    println((1..9).joinToString("\n") { "$value x $it = ${value * it}" })
}