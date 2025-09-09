package secondBlock

import kotlin.math.pow

fun main() {
    val clientDeposit = 70_000L
    val percent = 16.7
    val age = 20

    val result = bankCalc(deposit = clientDeposit, percent = percent, age = age)
    print("%.3f".format(result))
}

fun bankCalc(deposit: Long, percent: Double, age: Int): Double {
    val rate = percent / 100.0
    return deposit * (1 + rate).pow(age.toDouble())
}