package ninethLesson

fun main() {
    println("Введите 5 ингредиентов, перечислите их через запятую с пробелом")
    val userIngredients: List<String> = (readln().split(", ")).sorted()
    println(userIngredients)
}