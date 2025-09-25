package ninethLesson

fun main() {
    val ingredientsForOmelet = listOf(2, 50, 15)
    println("Введите кол-во порций:")
    val userInput = readln().toInt()

    val userIngredientsForOmelet = ingredientsForOmelet.map { it * userInput }

    println("На $userInput порций вам понадобится: яиц - ${userIngredientsForOmelet[0]} шт, молока - ${userIngredientsForOmelet[1]} мл, сливочного масла - ${userIngredientsForOmelet[2]} гр")
}