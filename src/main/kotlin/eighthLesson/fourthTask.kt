package eighthLesson

fun main() {
    val arrayOfIngredientsForSmth = arrayOf("морковь", "капуста", "кабачок", "рыба")
    println("Список ингредиентов:")
    for (i in arrayOfIngredientsForSmth.indices) {
        println(arrayOfIngredientsForSmth[i])
    }
    println("Введите ингредиент который хотите заменить:")
    val userInputWhatToReplace = readln().lowercase()
    println("Введите на какой ингредиент хотите заменить:")
    val userInputWhatToReplaceWith = readln().lowercase()

    val i = arrayOfIngredientsForSmth.indexOf(userInputWhatToReplace)

    arrayOfIngredientsForSmth[i] = userInputWhatToReplaceWith
}
