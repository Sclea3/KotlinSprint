package fourthLesson

const val PERFECT_IS_SUNNY = true
const val PERFECT_IS_AWNING_OPEN = true
const val PERFECT_HUMIDITY = 20
const val BAD_SEASON = "winter"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val humidity = 20
    val season = "winter"

    val isSuitable = isSunny == PERFECT_IS_SUNNY &&
            isAwningOpen == PERFECT_IS_AWNING_OPEN &&
            humidity == PERFECT_HUMIDITY &&
            season != BAD_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isSuitable")
}