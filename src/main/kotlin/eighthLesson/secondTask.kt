package eighthLesson

fun main() {
    val arrayOfIngredientsForSmth = arrayOf("морковь", "капуста", "кабачок", "рыба")
    println("Какой ингридиент хотите найти?")
    val userInput = readln().lowercase()
    for (i in 0..arrayOfIngredientsForSmth.size-1) {
        if (userInput == arrayOfIngredientsForSmth[i]) {
            println("Ингридиент \"$userInput\" в рецепте есть")
            return
        }
    }
    println("Такого ингридиента в рецепте нет")
}
