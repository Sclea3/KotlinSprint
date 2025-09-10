package fifthLesson

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введите год своего рождения:")
    val userYearOfBirth = readln().toInt()
    val currentUserAge = 2025 - userYearOfBirth

    when  {
        currentUserAge >= AGE_OF_MAJORITY -> println("Показать экран со скрытым контентом")
        else -> println("Неподходящий возраст")
    }
}