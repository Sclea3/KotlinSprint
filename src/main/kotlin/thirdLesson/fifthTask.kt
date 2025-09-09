package thirdLesson

fun main() {
    val inputString = "D2-D4;0"

    val listFromString = inputString.split("-", ";")

    val finalFrom: String = listFromString[0]
    val finalTo: String = listFromString[1]
    val finalMoveCtr: Int = listFromString[2].toInt()
    println("$finalFrom $finalTo $finalMoveCtr")
}