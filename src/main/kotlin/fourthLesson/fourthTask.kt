package fourthLesson

fun main() {
    val dayOfTraining = 5

    val isArmsAndAbsDay = dayOfTraining % 2 == 1

    val message = """
Упражнения для рук:       $isArmsAndAbsDay
Упражнения для ног:       ${!isArmsAndAbsDay}
Упражнения для спины:     ${!isArmsAndAbsDay}
Упражнения для пресса:    $isArmsAndAbsDay
    """.trimMargin()

    println(message)
}