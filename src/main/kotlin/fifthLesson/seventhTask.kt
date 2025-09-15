package fifthLesson

fun main() {
    println("Введите расстояние поездки (в километрах)")
    val tripDistance = readln().toDoubleOrNull() ?: 0.0
    println("Введите расход топлина на 100 км (в литрах)")
    val fuelConsumption: Double = readln().toDoubleOrNull() ?: 0.0
    println("Введите текущую цену за литр топлива")
    val fuelPrice = readln().toDoubleOrNull() ?: 0.0

    val fuelForTrip = (tripDistance * fuelConsumption) / 100
    val totalFuelCost = fuelForTrip * fuelPrice

    println("Общее кол-во необходимого топлива: $fuelForTrip\nИтоговая стоимость поездки: %.2f".format(totalFuelCost))
}
