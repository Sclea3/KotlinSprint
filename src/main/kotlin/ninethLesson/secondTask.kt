package ninethLesson

const val DISAGREE_NO = "no"
const val DISAGREE_N = "n"

fun main() {
    val listOfIngredients = mutableListOf("морковь", "капуста", "кабачок")
    println("В рецепте есть базовые ингредиенты: ${listOfIngredients.joinToString(", ") }")
    println("Желаете добавить еще? Y/N")
    val userInputAgreeToAdd = readln()
    if (userInputAgreeToAdd.equals(DISAGREE_NO) || userInputAgreeToAdd.equals(DISAGREE_N)) {
        return
    }
    println("Какой ингредиент вы хотите добавить?")
    val userInputToAdd = readln()
    listOfIngredients.add(userInputToAdd)
    println("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString(", ") }")
}