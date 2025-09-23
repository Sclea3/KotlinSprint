package ninethLesson

fun main() {
    val ingredientsForOmelet = listOf(2, 50, 15)
    val userIngredientsForOmelet = mutableListOf<Int>()
    println("Введите кол-во порций:")
    val userInput = readln().toInt()
    ingredientsForOmelet.forEach { userIngredientsForOmelet.add(it * userInput) }

    println("На $userInput порций вам понадобится: яиц - ${userIngredientsForOmelet[0]} шт, молока - ${userIngredientsForOmelet[1]} мл, сливочного масла - ${userIngredientsForOmelet[2]} гр")
}