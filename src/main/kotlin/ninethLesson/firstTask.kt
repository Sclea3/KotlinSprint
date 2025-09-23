package ninethLesson

fun main() {
    val ingredientsNames = listOf("морковь", "капуста", "помидор")
    println("В рецепте есть следующие ингредиенты:\n${ingredientsNames.joinToString("\n")}")
//    Либо ingredientsNames.forEach {println(it)}
}