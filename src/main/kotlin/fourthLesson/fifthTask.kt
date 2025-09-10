package fourthLesson

const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val MIN_FOOD_BOXES = 50

fun main() {
    print("Наличие повреждений корпуса: ")
    val hasDamage = readLine()?.toBoolean() ?: false
    print("Текущий состав экипажа: ")
    val crewSize = readLine()?.toIntOrNull() ?: 0
    print("Количество ящиков с провизией на борту: ")
    val foodBoxes = readLine()?.toIntOrNull() ?: 0
    print("Благоприятность метеоусловий: ")
    val isWeatherGood = readLine()?.toBoolean() ?: false

    val canSail = (!hasDamage &&
            crewSize in MIN_CREW_SIZE..MAX_CREW_SIZE &&
            foodBoxes > MIN_FOOD_BOXES) ||
            (hasDamage && crewSize == MAX_CREW_SIZE &&
                    foodBoxes >= MIN_FOOD_BOXES &&
                    isWeatherGood)

    if (canSail) {
        println("Корабль может отправиться в долгосрочное плавание.")
    } else {
        println("Корабль не может отправиться в долгосрочное плавание.")
    }
}