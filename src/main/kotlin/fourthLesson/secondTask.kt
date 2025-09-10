package fourthLesson

data class WeightCategory(
    val name: String,
    val minWeight: Int,
    val maxWeight: Int,
    val maxVolume: Int,
)

data class Ship(
    val weight: Int,
    val volume: Int,
)

fun main() {
    val categoryAverage = WeightCategory(
        name = "Average",
        minWeight = 35,
        maxWeight = 100,
        maxVolume = 100,
    )
    val shipOne = Ship(
        weight = 42,
        volume = 120,
    )
    println(printIsShipFitReqs(categoryAverage = categoryAverage, ship = shipOne))

    val shipTwo = Ship(
        weight = 20,
        volume = 80
    )
    println(printIsShipFitReqs(categoryAverage = categoryAverage, ship = shipTwo))

    val shipThree = Ship(
        weight = 50,
        volume = 100,
    )
    println(printIsShipFitReqs(categoryAverage = categoryAverage, ship = shipThree))
}

fun printIsShipFitReqs(categoryAverage: WeightCategory, ship: Ship,): String {
    return "Груз с весом ${ship.weight} кг и объемом ${ship.volume} л соответствует категории 'Average': ${(categoryAverage.minWeight < ship.weight) && (ship.weight <= categoryAverage.maxWeight) && (ship.volume < categoryAverage.maxVolume)}"
}
