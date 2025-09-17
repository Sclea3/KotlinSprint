package fourthLesson

const val TOTAL_TABLES = 13

fun main() {
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9
    println("Доступность столиков на сегодня: ${bookedTablesToday < TOTAL_TABLES}\nДоступность столиков на завтра: ${bookedTablesTomorrow < TOTAL_TABLES}")
}