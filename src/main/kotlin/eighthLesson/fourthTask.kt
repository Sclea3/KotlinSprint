package eighthLesson

fun main() {
    val arrayOfIngredientsForSmth = arrayOf("морковь", "капуста", "кабачок", "рыба")
    println("Список ингредиентов:")
    arrayOfIngredientsForSmth.forEach { println(it) }

    println("Введите ингредиент который хотите заменить:")
    val replaceIndex = arrayOfIngredientsForSmth.indexOf(readln().lowercase())
    if (replaceIndex == -1) {
        println("Такого ингредиента нет в списке")
        return
    }

    println("Введите на какой ингредиент хотите заменить:")
    val userInputWhatToReplaceWith = readln().lowercase()

    arrayOfIngredientsForSmth[replaceIndex] = userInputWhatToReplaceWith

    println("Готово! Вы сохранили следующий список: ${arrayOfIngredientsForSmth.forEach { println(it) }}")
}
