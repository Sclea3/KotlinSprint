package ninethLesson

fun main() {
    val ingredients = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите ингредиент №$i:")
        val input = readln().trim()
        ingredients.add(input)
    }

    val listOfIngredients = ingredients.toList().sorted()

    val resultList = mutableListOf<String>()
    for ((index, item) in listOfIngredients.withIndex()) {
        if (index == 0) {
            resultList.add(item.replaceFirstChar { it.uppercase() })
        } else {
            resultList.add(item)
        }
    }

    println(resultList.joinToString(", "))
}
