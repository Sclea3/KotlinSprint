package fourthLesson

fun main() {
    val totalTables = 13
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9
    println("Доступность столиков на сегодня: ${bookedTablesToday < totalTables}\nДоступность столиков на завтра: ${bookedTablesTomorrow < totalTables}")
}