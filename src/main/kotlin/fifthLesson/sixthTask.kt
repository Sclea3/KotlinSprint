package fifthLesson

const val CENTIMETERS_IN_METER = 100

fun main() {
    println("Введите свой вес")
    val weight = readln().toDoubleOrNull() ?: 0.0

    println("Введите свой рост")
    val heightCentimeter = readln().toDoubleOrNull() ?: 0.0
    val heightMeters = heightCentimeter / CENTIMETERS_IN_METER

    val bodyMassIndex = weight / (heightMeters * heightMeters)
    when {
        (18.5 > bodyMassIndex) -> println("Недостаточная масса тела")
        (18.5 <= bodyMassIndex && bodyMassIndex < 25) -> println("Нормальная масса тела")
        (25 <= bodyMassIndex && bodyMassIndex < 30) -> println("Избыточная масса тела")
        (bodyMassIndex >= 30) -> println("Ожирение")
    }
    println("Ваш ИМТ: %.2f".format(bodyMassIndex))
}
