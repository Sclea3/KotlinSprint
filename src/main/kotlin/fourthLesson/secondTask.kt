package fourthLesson

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val ships = listOf(
        Pair(42, 120),  // вес, объем
        Pair(20, 80),
        Pair(50, 100)
    )

    for ((weight, volume) in ships) {
        val fits = weight > minWeight && weight <= maxWeight && volume < maxVolume
        println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $fits")
    }
}