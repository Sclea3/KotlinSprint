package thirdLesson

fun main() {
    val value = 3
    multTable(value)
}

fun multTable(value: Int) {
    val multiplicatorsList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (multiplicator in multiplicatorsList) {
        println("$value x $multiplicator = ${value * multiplicator}")
    }
}