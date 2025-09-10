package fourthLesson

fun main() {
    val dayOfTraining = 5

    // Определяем группу мышц по четности дня
    // День 1, 3, 5, 7... - руки и пресс
    // День 2, 4, 6, 8... - ноги и спина
    val isArmsAndAbsDay = dayOfTraining % 2 == 1

    val message = """
Упражнения для рук:       $isArmsAndAbsDay
Упражнения для ног:       ${!isArmsAndAbsDay}
Упражнения для спины:     ${!isArmsAndAbsDay}
Упражнения для пресса:    $isArmsAndAbsDay
    """.trimMargin()

    println(message)
}