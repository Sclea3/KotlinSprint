package secondBlock

fun main() {
    val studentScores = arrayOf(3, 4, 3, 5)
    val sum = studentScores.sum()
    val average = sum.toDouble() / studentScores.size

    println("%.2f".format(average))
}