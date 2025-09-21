package eighthLesson

fun main() {
    val arrayOfIngredientsForSmth = arrayOf("морковь", "капуста", "кабачок", "рыба")
    println("Список ингредиентов:")
    arrayOfIngredientsForSmth.forEach { println(it) }

    println("Введите ингредиент который хотите заменить:")
    val userInputWhatToReplace = readln().lowercase()
    if (userInputWhatToReplace !in arrayOfIngredientsForSmth) {
        println("Такого ингридиента нет в списке")
        return
    }

    println("Введите на какой ингредиент хотите заменить:")
    val userInputWhatToReplaceWith = readln().lowercase()

    val i = arrayOfIngredientsForSmth.indexOf(userInputWhatToReplace)

    arrayOfIngredientsForSmth[i] = userInputWhatToReplaceWith

    println("Готово! Вы сохранили следующий список: ${arrayOfIngredientsForSmth.forEach { println(it) }}")
}
