package eighthLesson

fun main() {
    val arrayOfIngredientsForSmth = arrayOf("морковь", "капуста", "кабачок", "рыба")
    println("Какой ингридиент хотите найти?")
    val userInput = readln().lowercase()
    if (userInput in arrayOfIngredientsForSmth) {
        println("Ингридиент \"$userInput\" в рецепте есть")
        return
    }
    println("Такого ингридиента в рецепте нет")
}